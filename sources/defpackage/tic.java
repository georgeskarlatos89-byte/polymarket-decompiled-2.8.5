package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum tic {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    tic(int[] iArr, int i) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i;
    }

    public final int a() {
        return this.bits;
    }

    public final int b(g7k g7kVar) {
        char c;
        int i = g7kVar.a;
        if (i <= 9) {
            c = 0;
        } else if (i <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.characterCountBitsForVersions[c];
    }
}
