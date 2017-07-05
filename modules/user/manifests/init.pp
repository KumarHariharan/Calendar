class user{
      user { "jane":
    	ensure     => present,
    	uid        => '507',
    	shell      => '/bin/zsh',
        home       => '/home/jane',
        managehome => true,
           }
}
