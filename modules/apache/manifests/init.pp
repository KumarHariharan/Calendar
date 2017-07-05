class apache{
      package{ 'httpd' :
               ensure => installed, 
	     }
      service{"httpd" :
               ensure => running,
	       enable => true,	
             }
      file   {'/var/www/html/index.html' :
               ensure => 'file',
               source => 'puppet:///modules/apache/index.html',
	       owner => 'root',
               notify => Service ['httpd'],
               require => Package ['httpd'];
             }
}
  
