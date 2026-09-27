package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class pa3 {
    public static final Map a;

    static {
        ee1 ee1Var = new ee1("4000000000000000", "4999999999999999", true);
        y7 y7Var = y7.CartesBancaires;
        p63 p63Var = p63.Unknown;
        a = d1c.e(new Pair("4000002500001001", CollectionsKt.listOf(new z7(ee1Var, 16, y7Var, p63Var, null), new z7(new ee1("4000000000000000", "4999999999999999", true), 16, y7.Visa, p63Var, null))), new Pair("5555552500001001", CollectionsKt.listOf(new z7(new ee1("5100000000000000", "5599999999999999", true), 16, y7Var, p63Var, null), new z7(new ee1("5100000000000000", "5599999999999999", true), 16, y7.Mastercard, p63Var, null))));
    }
}
