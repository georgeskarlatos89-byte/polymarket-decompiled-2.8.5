package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fti {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[tma.values().length];
        try {
            iArr[tma.COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tma.PASTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tma.CUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tma.LEFT_CHAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tma.RIGHT_CHAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tma.LEFT_WORD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tma.RIGHT_WORD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[tma.PREV_PARAGRAPH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[tma.NEXT_PARAGRAPH.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[tma.UP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[tma.DOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[tma.PAGE_UP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[tma.PAGE_DOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[tma.LINE_START.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[tma.LINE_END.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[tma.LINE_LEFT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[tma.LINE_RIGHT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[tma.HOME.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[tma.END.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[tma.DELETE_PREV_CHAR.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[tma.DELETE_NEXT_CHAR.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[tma.DELETE_PREV_WORD.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[tma.DELETE_NEXT_WORD.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[tma.DELETE_FROM_LINE_START.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[tma.DELETE_TO_LINE_END.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[tma.NEW_LINE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[tma.TAB.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[tma.SELECT_ALL.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[tma.SELECT_LEFT_CHAR.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[tma.SELECT_RIGHT_CHAR.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[tma.SELECT_LEFT_WORD.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[tma.SELECT_RIGHT_WORD.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[tma.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[tma.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[tma.SELECT_LINE_START.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[tma.SELECT_LINE_END.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[tma.SELECT_LINE_LEFT.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[tma.SELECT_LINE_RIGHT.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[tma.SELECT_UP.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[tma.SELECT_DOWN.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[tma.SELECT_PAGE_UP.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[tma.SELECT_PAGE_DOWN.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[tma.SELECT_HOME.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[tma.SELECT_END.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[tma.DESELECT.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[tma.UNDO.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[tma.REDO.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[tma.CHARACTER_PALETTE.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[tma.CENTER.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        a = iArr;
    }
}
