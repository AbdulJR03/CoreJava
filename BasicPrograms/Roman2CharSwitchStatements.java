package BasicPrograms;

public class Roman2CharSwitchStatements {

    public static void main(String[] args) {
        System.out.println(romanToInt("LXVMC"));

    }
    public static int romanToInt(String s) {
        int answer = 0;
        int number = 0;
        int prevnumber = 0;

        for(int i = s.length()-1;i>=0;i--) {
            char currentchar = s.charAt(i);


            switch(currentchar) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;

                case 'C':
                    number = 100;
                    break;

                case 'D':
                    number = 500;
                    break;

                case 'M':
                    number = 1000;
                    break;
            }

            if(number>=prevnumber) {
                answer+=number;
            }else {
                answer-=number;

            }
            prevnumber = number;

        }



        return answer;
    }

}

