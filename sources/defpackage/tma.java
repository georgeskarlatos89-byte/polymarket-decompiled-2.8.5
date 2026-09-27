package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tma {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tma[] $VALUES;
    public static final tma CENTER;
    public static final tma CHARACTER_PALETTE;
    public static final tma COPY;
    public static final tma CUT;
    public static final tma DELETE_FROM_LINE_START;
    public static final tma DELETE_NEXT_CHAR;
    public static final tma DELETE_NEXT_WORD;
    public static final tma DELETE_PREV_CHAR;
    public static final tma DELETE_PREV_WORD;
    public static final tma DELETE_TO_LINE_END;
    public static final tma DESELECT;
    public static final tma DOWN;
    public static final tma END;
    public static final tma HOME;
    public static final tma LEFT_CHAR;
    public static final tma LEFT_WORD;
    public static final tma LINE_END;
    public static final tma LINE_LEFT;
    public static final tma LINE_RIGHT;
    public static final tma LINE_START;
    public static final tma NEW_LINE;
    public static final tma NEXT_PARAGRAPH;
    public static final tma PAGE_DOWN;
    public static final tma PAGE_UP;
    public static final tma PASTE;
    public static final tma PREV_PARAGRAPH;
    public static final tma REDO;
    public static final tma RIGHT_CHAR;
    public static final tma RIGHT_WORD;
    public static final tma SELECT_ALL;
    public static final tma SELECT_DOWN;
    public static final tma SELECT_END;
    public static final tma SELECT_HOME;
    public static final tma SELECT_LEFT_CHAR;
    public static final tma SELECT_LEFT_WORD;
    public static final tma SELECT_LINE_END;
    public static final tma SELECT_LINE_LEFT;
    public static final tma SELECT_LINE_RIGHT;
    public static final tma SELECT_LINE_START;
    public static final tma SELECT_NEXT_PARAGRAPH;
    public static final tma SELECT_PAGE_DOWN;
    public static final tma SELECT_PAGE_UP;
    public static final tma SELECT_PREV_PARAGRAPH;
    public static final tma SELECT_RIGHT_CHAR;
    public static final tma SELECT_RIGHT_WORD;
    public static final tma SELECT_UP;
    public static final tma TAB;
    public static final tma UNDO;
    public static final tma UP;
    private final boolean editsText;

    static {
        tma tmaVar = new tma("LEFT_CHAR", 0, false);
        LEFT_CHAR = tmaVar;
        tma tmaVar2 = new tma("RIGHT_CHAR", 1, false);
        RIGHT_CHAR = tmaVar2;
        tma tmaVar3 = new tma("RIGHT_WORD", 2, false);
        RIGHT_WORD = tmaVar3;
        tma tmaVar4 = new tma("LEFT_WORD", 3, false);
        LEFT_WORD = tmaVar4;
        tma tmaVar5 = new tma("NEXT_PARAGRAPH", 4, false);
        NEXT_PARAGRAPH = tmaVar5;
        tma tmaVar6 = new tma("PREV_PARAGRAPH", 5, false);
        PREV_PARAGRAPH = tmaVar6;
        tma tmaVar7 = new tma("LINE_START", 6, false);
        LINE_START = tmaVar7;
        tma tmaVar8 = new tma("LINE_END", 7, false);
        LINE_END = tmaVar8;
        tma tmaVar9 = new tma("LINE_LEFT", 8, false);
        LINE_LEFT = tmaVar9;
        tma tmaVar10 = new tma("LINE_RIGHT", 9, false);
        LINE_RIGHT = tmaVar10;
        tma tmaVar11 = new tma("UP", 10, false);
        UP = tmaVar11;
        tma tmaVar12 = new tma("DOWN", 11, false);
        DOWN = tmaVar12;
        tma tmaVar13 = new tma("CENTER", 12, false);
        CENTER = tmaVar13;
        tma tmaVar14 = new tma("PAGE_UP", 13, false);
        PAGE_UP = tmaVar14;
        tma tmaVar15 = new tma("PAGE_DOWN", 14, false);
        PAGE_DOWN = tmaVar15;
        tma tmaVar16 = new tma("HOME", 15, false);
        HOME = tmaVar16;
        tma tmaVar17 = new tma("END", 16, false);
        END = tmaVar17;
        tma tmaVar18 = new tma("COPY", 17, false);
        COPY = tmaVar18;
        tma tmaVar19 = new tma("PASTE", 18, true);
        PASTE = tmaVar19;
        tma tmaVar20 = new tma("CUT", 19, true);
        CUT = tmaVar20;
        tma tmaVar21 = new tma("DELETE_PREV_CHAR", 20, true);
        DELETE_PREV_CHAR = tmaVar21;
        tma tmaVar22 = new tma("DELETE_NEXT_CHAR", 21, true);
        DELETE_NEXT_CHAR = tmaVar22;
        tma tmaVar23 = new tma("DELETE_PREV_WORD", 22, true);
        DELETE_PREV_WORD = tmaVar23;
        tma tmaVar24 = new tma("DELETE_NEXT_WORD", 23, true);
        DELETE_NEXT_WORD = tmaVar24;
        tma tmaVar25 = new tma("DELETE_FROM_LINE_START", 24, true);
        DELETE_FROM_LINE_START = tmaVar25;
        tma tmaVar26 = new tma("DELETE_TO_LINE_END", 25, true);
        DELETE_TO_LINE_END = tmaVar26;
        tma tmaVar27 = new tma("SELECT_ALL", 26, false);
        SELECT_ALL = tmaVar27;
        tma tmaVar28 = new tma("SELECT_LEFT_CHAR", 27, false);
        SELECT_LEFT_CHAR = tmaVar28;
        tma tmaVar29 = new tma("SELECT_RIGHT_CHAR", 28, false);
        SELECT_RIGHT_CHAR = tmaVar29;
        tma tmaVar30 = new tma("SELECT_UP", 29, false);
        SELECT_UP = tmaVar30;
        tma tmaVar31 = new tma("SELECT_DOWN", 30, false);
        SELECT_DOWN = tmaVar31;
        tma tmaVar32 = new tma("SELECT_PAGE_UP", 31, false);
        SELECT_PAGE_UP = tmaVar32;
        tma tmaVar33 = new tma("SELECT_PAGE_DOWN", 32, false);
        SELECT_PAGE_DOWN = tmaVar33;
        tma tmaVar34 = new tma("SELECT_HOME", 33, false);
        SELECT_HOME = tmaVar34;
        tma tmaVar35 = new tma("SELECT_END", 34, false);
        SELECT_END = tmaVar35;
        tma tmaVar36 = new tma("SELECT_LEFT_WORD", 35, false);
        SELECT_LEFT_WORD = tmaVar36;
        tma tmaVar37 = new tma("SELECT_RIGHT_WORD", 36, false);
        SELECT_RIGHT_WORD = tmaVar37;
        tma tmaVar38 = new tma("SELECT_NEXT_PARAGRAPH", 37, false);
        SELECT_NEXT_PARAGRAPH = tmaVar38;
        tma tmaVar39 = new tma("SELECT_PREV_PARAGRAPH", 38, false);
        SELECT_PREV_PARAGRAPH = tmaVar39;
        tma tmaVar40 = new tma("SELECT_LINE_START", 39, false);
        SELECT_LINE_START = tmaVar40;
        tma tmaVar41 = new tma("SELECT_LINE_END", 40, false);
        SELECT_LINE_END = tmaVar41;
        tma tmaVar42 = new tma("SELECT_LINE_LEFT", 41, false);
        SELECT_LINE_LEFT = tmaVar42;
        tma tmaVar43 = new tma("SELECT_LINE_RIGHT", 42, false);
        SELECT_LINE_RIGHT = tmaVar43;
        tma tmaVar44 = new tma("DESELECT", 43, false);
        DESELECT = tmaVar44;
        tma tmaVar45 = new tma("NEW_LINE", 44, true);
        NEW_LINE = tmaVar45;
        tma tmaVar46 = new tma("TAB", 45, true);
        TAB = tmaVar46;
        tma tmaVar47 = new tma("UNDO", 46, true);
        UNDO = tmaVar47;
        tma tmaVar48 = new tma("REDO", 47, true);
        REDO = tmaVar48;
        tma tmaVar49 = new tma("CHARACTER_PALETTE", 48, true);
        CHARACTER_PALETTE = tmaVar49;
        tma[] tmaVarArr = {tmaVar, tmaVar2, tmaVar3, tmaVar4, tmaVar5, tmaVar6, tmaVar7, tmaVar8, tmaVar9, tmaVar10, tmaVar11, tmaVar12, tmaVar13, tmaVar14, tmaVar15, tmaVar16, tmaVar17, tmaVar18, tmaVar19, tmaVar20, tmaVar21, tmaVar22, tmaVar23, tmaVar24, tmaVar25, tmaVar26, tmaVar27, tmaVar28, tmaVar29, tmaVar30, tmaVar31, tmaVar32, tmaVar33, tmaVar34, tmaVar35, tmaVar36, tmaVar37, tmaVar38, tmaVar39, tmaVar40, tmaVar41, tmaVar42, tmaVar43, tmaVar44, tmaVar45, tmaVar46, tmaVar47, tmaVar48, tmaVar49};
        $VALUES = tmaVarArr;
        $ENTRIES = new wg7(tmaVarArr);
    }

    public tma(String str, int i, boolean z) {
        this.editsText = z;
    }

    public static tma valueOf(String str) {
        return (tma) Enum.valueOf(tma.class, str);
    }

    public static tma[] values() {
        return (tma[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.editsText;
    }
}
