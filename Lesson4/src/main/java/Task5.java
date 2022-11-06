public class Task5 {
    public static void main(String[] args) {
        System.out.println("byte+byte=т,byte+short=ня,byte+char=я,byte+int=ня,byte+long=ня,byte+float=ня,byte+double=ня,byte+boolean=x");
        System.out.println("short+short=т,short+byte=я,short+char=я,short+int=ня,short+long=ня,short+float=ня,short+double=ня,short+boolean=x");
        System.out.println("char+char=т,char+byte=х,char+short=x,char+int=х,char+long=х,char+float=х,char+double=х,char+boolean=я");
        System.out.println("int+int=т,int+byte=я,int+short=я,int+char=x,int+long=ня,int+float=ня,int+double=ня,int+boolean=x");
        System.out.println("long+long=т,long+byte=я,long+short=я,long+char=я,long+int=я,long+float=ня,long+double=ня,long+boolean=x");
        System.out.println("float+float=т,float+byte=я,float+short=я,float+char=я,float+int=я,float+long=я,float+double=ня,float+boolean=x");
        System.out.println("double+double=т,double+byte=т,double+short=ня,double+char=x,double+int=ня,double+long=ня,double+float=ня,double+boolean=x");
        System.out.println("boolean+boolean=х,boolean+byte=х,boolean+short=х,boolean+char=x,boolean+int=х,boolean+long=х,boolean+float=х,boolean+double=х,");
    }
}

// byte	short	char	int 	long	float	double	boolean
      //   На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.