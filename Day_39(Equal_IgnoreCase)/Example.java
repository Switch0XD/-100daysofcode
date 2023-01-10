while (toffset < last)   
{  
char ch1 = getChar(value, toffset++);  
char ch2 = getChar(other, ooffset++);  
if (ch1 == ch2)   
{  
continue;  
}  
// convert each character to uppercase and   
// then make the comparison.  
// If the comparison yeilds a true value,   
// then next pair of characters should be scanned  
char uCh1 = Character.toUpperCase(ch1);  
char uCh2 = Character.toUpperCase(ch2);  
if (uCh1 == u2)   
{  
continue;  
}  
  
// convert each character to lowercase and   
// then make the comparison.  
// If the comparison yeilds a true value,   
// then next pair of characters should be scanned  
// Otherwise, return false.  
if (Character.toLowerCase(uCh1) == Character.toLowerCase(uCh2))   
{  
continue;  
}  
return false;  
}  
  
// reaching here means the content of both the strings   
// are the same after ignoring the case sensitiveness  
return true;  