package com.banana.servicedemo;

import android.util.Log;

import java.util.Random;

/**
 * Created by bobsha on 2020/4/10.
 */
public class IfSwitchCompareObj {
    public void startSwitchTest() {
        final Random random = new Random(100);
        new Thread(new Runnable() {

            @Override
            public void run() {
                Log.e("startSwitchTest", "start time:" + System.currentTimeMillis());
                for (int i = 0; i < 1000000; i++) {
                    enterSwitch(random.nextInt());
                }
                Log.e("startSwitchTest", "end time:" + System.currentTimeMillis());
            }
        }).start();
    }

    public void startIfTest() {
        final Random random = new Random(100);
        new Thread(new Runnable() {

            @Override
            public void run() {
                Log.e("startIfTest", "start time:" + System.currentTimeMillis());
                for (int i = 0; i < 1000000; i++) {
                    enterIf(random.nextInt());
                }
                Log.e("startIfTest", "end time:" + System.currentTimeMillis());
            }
        }).start();
    }

    private void enterSwitch(int number) {
        switch (number) {
            case 0:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 1:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 2:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 3:
                Log.d("enterSwitch", "number:" + number);
                break;
                case 4:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 5:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 6:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 7:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 8:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 9:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 10:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 11:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 12:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 13:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 14:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 15:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 16:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 17:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 18:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 19:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 20:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 21:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 22:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 23:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 24:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 25:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 26:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 27:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 28:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 29:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 30:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 31:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 32:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 33:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 34:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 35:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 36:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 37:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 38:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 39:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 40:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 41:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 42:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 43:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 44:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 45:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 46:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 47:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 48:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 49:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 50:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 51:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 52:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 53:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 54:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 55:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 56:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 57:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 58:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 59:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 60:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 61:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 62:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 63:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 64:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 65:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 66:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 67:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 68:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 69:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 70:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 71:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 72:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 73:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 74:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 75:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 76:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 77:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 78:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 79:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 80:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 81:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 82:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 83:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 84:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 85:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 86:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 87:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 88:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 89:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 90:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 91:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 92:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 93:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 94:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 95:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 96:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 97:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 98:
                Log.d("enterSwitch", "number:" + number);
                break;
            case 99:
                Log.d("enterSwitch", "number:" + number);
                break;
            default:
                break;
        }
    }

    private void enterIf(int number) {
        if (number == 0) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 1) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 2) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 3) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 4) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 5) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 6) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 7) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 8) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 9) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 10) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 11) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 12) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 13) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 14) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 15) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 16) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 17) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 18) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 19) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 20) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 21) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 22) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 23) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 24) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 25) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 26) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 27) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 28) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 29) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 30) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 31) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 32) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 33) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 34) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 35) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 36) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 37) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 38) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 39) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 40) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 41) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 42) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 43) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 44) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 45) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 46) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 47) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 48) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 49) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 50) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 51) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 52) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 53) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 54) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 55) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 56) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 57) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 58) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 59) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 60) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 61) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 62) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 63) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 64) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 65) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 66) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 67) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 68) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 69) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 70) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 71) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 72) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 73) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 74) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 75) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 76) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 77) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 78) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 79) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 80) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 81) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 82) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 83) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 84) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 85) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 86) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 87) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 88) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 89) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 90) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 91) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 92) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 93) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 94) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 95) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 96) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 97) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 98) {
            Log.d("enterIf", "number:" + number);
            return;
        }
        if (number == 99) {
            Log.d("enterIf", "number:" + number);
            return;
        }
    }
}
