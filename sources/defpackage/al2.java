package defpackage;

import com.polymarket.apputil.DateFormatters;
import java.util.Date;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class al2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ al2[] $VALUES;
    public static final al2 Relative;
    public static final al2 RelativeCompact;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, al2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, al2] */
    static {
        ?? r0 = new Enum("Relative", 0);
        Relative = r0;
        ?? r1 = new Enum("RelativeCompact", 1);
        RelativeCompact = r1;
        al2[] al2VarArr = {r0, r1};
        $VALUES = al2VarArr;
        $ENTRIES = new wg7(al2VarArr);
    }

    public static al2 valueOf(String str) {
        return (al2) Enum.valueOf(al2.class, str);
    }

    public static al2[] values() {
        return (al2[]) $VALUES.clone();
    }

    public final String a(Date date) {
        date.getClass();
        int i = zk2.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return DateFormatters.INSTANCE.relativeCompactText(date);
            }
            dmk.a();
            return null;
        }
        return DateFormatters.INSTANCE.relativeText(date);
    }
}
