package defpackage;

import android.content.Context;
import android.util.Patterns;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lq2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lq2[] $VALUES;
    public static final lq2 Email;
    private final Function2<Context, String, Unit> onClick;
    private final Pattern pattern;

    static {
        Patterns.EMAIL_ADDRESS.getClass();
        kq2 kq2Var = kq2.f;
        lq2 lq2Var = new lq2();
        Email = lq2Var;
        lq2[] lq2VarArr = {lq2Var};
        $VALUES = lq2VarArr;
        $ENTRIES = new wg7(lq2VarArr);
    }

    public lq2() {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        kq2 kq2Var = kq2.f;
        this.pattern = pattern;
        this.onClick = kq2Var;
    }

    public static lq2 valueOf(String str) {
        return (lq2) Enum.valueOf(lq2.class, str);
    }

    public static lq2[] values() {
        return (lq2[]) $VALUES.clone();
    }

    public final Function2 a() {
        return this.onClick;
    }

    public final Pattern b() {
        return this.pattern;
    }
}
