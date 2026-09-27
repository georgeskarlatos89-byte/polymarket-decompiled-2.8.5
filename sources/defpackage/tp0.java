package defpackage;

import io.getstream.chat.android.models.AttachmentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tp0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tp0[] $VALUES;
    public static final tp0 FILE;
    public static final tp0 IMAGE;
    public static final tp0 VIDEO;
    private final String value;

    static {
        tp0 tp0Var = new tp0("IMAGE", 0, "image");
        IMAGE = tp0Var;
        tp0 tp0Var2 = new tp0("VIDEO", 1, "video");
        VIDEO = tp0Var2;
        tp0 tp0Var3 = new tp0("FILE", 2, AttachmentType.FILE);
        FILE = tp0Var3;
        tp0[] tp0VarArr = {tp0Var, tp0Var2, tp0Var3};
        $VALUES = tp0VarArr;
        $ENTRIES = new wg7(tp0VarArr);
    }

    public tp0(String str, int i, String str2) {
        this.value = str2;
    }

    public static tp0 valueOf(String str) {
        return (tp0) Enum.valueOf(tp0.class, str);
    }

    public static tp0[] values() {
        return (tp0[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
