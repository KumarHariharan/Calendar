node default{
     class{ 'motd' :}
     class{ 'user' :}
     class{'apache':}
     class{'sshd':}
}
