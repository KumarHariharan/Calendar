class sshd{
package { 'openssh-server':
  ensure => installed,
}

file { '/etc/ssh/sshd_config':
  source  => 'puppet:///modules/sshd/sshd_config',
  owner   => 'root',
  group   => 'root',
  mode    => '0640',
  notify  => Service['sshd'], 
  require => Package['openssh-server'],
}

service { 'sshd':
  ensure     => running,
  enable     => true,
}
}
