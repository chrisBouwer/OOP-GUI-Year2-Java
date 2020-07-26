package vehicle.licensing.authority;

/*
 * @author Christiaan Bouwer VVF6HCS19
 */
class LicensePlate {

    public int CA = 0, ZN = 0, MP = 0, EC = 0, L = 0, GP = 0, NC = 0, FS = 0, NW = 0;

    public String getCode() {
        String[] provCode = {"CA", "ZN", "MP", "EC", "L", "GP", "NC", "FS", "NW"};
        int random = (int) (Math.random() * 9);

        //Switch to add up the number of plates generated per province
        switch (random) {
            case 0:
                CA++;
                break;
            case 1:
                ZN++;
                break;
            case 2:
                MP++;
                break;
            case 3:
                EC++;
                break;
            case 4:
                L++;
                break;
            case 5:
                GP++;
                break;
            case 6:
                NC++;
                break;
            case 7:
                FS++;
                break;
            case 8:
                NW++;
                break;
            default:
                break;
        }
        return provCode[random];
    }

    public static int getNumbers() {
        return (int) ((Math.random() * 999) + 1);
    }

    //Method using Math.random to retrun 3 random letters selected from alphabet
    public String getLetter() {
        String alphabet = "bcdfghjklmnpqrstvwxyz";
        return alphabet.charAt((int) (Math.random() * 21)) + ""
                + alphabet.charAt((int) (Math.random() * 21)) + ""
                + alphabet.charAt((int) (Math.random() * 21)) + "";
    }

    //Method to create the number plate
    //Recieves args: random 3 letters and 3 numbers as well as the area code
    //Checking if there are any empty characters to fill with zeros
    public String getVehicleReg(String letters, int numbers, String code) {

        String newNumbs = "";

        switch (String.valueOf(numbers).length()) {
            case 1:
                newNumbs = "00" + numbers;
                break;
            case 2:
                newNumbs = "0" + numbers;
                break;
            default:
                newNumbs = "" + numbers;
                break;
        }
        return letters.toUpperCase() + "-" + newNumbs + "-" + code;
    }
}
