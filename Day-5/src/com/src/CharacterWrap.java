package com.src;
import static java.lang.Character.*;
import static java.lang.Math.*;

public class CharacterWrap 
{
	public static void main(String[] args) 
	{
			char c='L';
			char q[]= {'e','k','h'};
			Character k=new Character(c);
			System.out.println(charCount(6));
			System.out.println(k.charValue());
			System.out.println(codePointAt(q,0));
			System.out.println(codePointBefore(q,1));
			System.out.println(compare('b','g'));
			System.out.println(k.compareTo('c'));
			System.out.println(digit(4,11));
			System.out.println(getNumericValue('a'));
			System.out.println(getType('a'));
			System.out.println(highSurrogate(1));
			System.out.println(isDefined(4));
			System.out.println(isHighSurrogate('a'));
			System.out.println(isIdentifierIgnorable(5));
			System.out.println(isISOControl(5));
			System.out.println(isJavaIdentifierPart('a'));
			System.out.println(isLetter('a'));
			System.out.println(isLetterOrDigit('a'));
			System.out.println(isLowerCase('H'));
			System.out.println(isMirrored('a'));
			System.out.println(isUpperCase('a'));
			System.out.println(isWhitespace(5));
			System.out.println(reverseBytes('a'));
			System.out.println(toChars(6));
			System.out.println(toLowerCase('K'));
			System.out.println(toUpperCase('l'));
			System.out.println(toTitleCase('a'));
			System.out.println(valueOf('a'));
			System.out.println(Character.MAX_CODE_POINT);
			System.out.println(Character.MIN_CODE_POINT);
			
		}

}


