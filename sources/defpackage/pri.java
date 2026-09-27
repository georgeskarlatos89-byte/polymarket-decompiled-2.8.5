package defpackage;

import android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pri {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pri[] $VALUES;
    public static final pri Autofill;
    public static final pri Copy;
    public static final pri Cut;
    public static final pri Paste;
    public static final pri SelectAll;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    static {
        pri priVar = new pri("Cut", 0, R.string.cut, R.attr.actionModeCutDrawable, e2n.a);
        Cut = priVar;
        pri priVar2 = new pri("Copy", 1, R.string.copy, R.attr.actionModeCopyDrawable, e2n.b);
        Copy = priVar2;
        pri priVar3 = new pri("Paste", 2, R.string.paste, R.attr.actionModePasteDrawable, e2n.c);
        Paste = priVar3;
        pri priVar4 = new pri("SelectAll", 3, R.string.selectAll, R.attr.actionModeSelectAllDrawable, e2n.d);
        SelectAll = priVar4;
        pri priVar5 = new pri("Autofill", 4, R.string.autofill, 0, e2n.e);
        Autofill = priVar5;
        pri[] priVarArr = {priVar, priVar2, priVar3, priVar4, priVar5};
        $VALUES = priVarArr;
        $ENTRIES = new wg7(priVarArr);
    }

    public pri(String str, int i, int i2, int i3, Object obj) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static pri valueOf(String str) {
        return (pri) Enum.valueOf(pri.class, str);
    }

    public static pri[] values() {
        return (pri[]) $VALUES.clone();
    }

    public final int a() {
        return this.drawableId;
    }

    public final Object b() {
        return this.key;
    }

    public final int c() {
        return this.stringId;
    }
}
