package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xt6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xt6[] $VALUES;
    public static final xt6 Amex;
    private static final Set<String> CERTIFICATE_EXTENSIONS;
    public static final xt6 CartesBancaires;
    public static final wt6 Companion;
    public static final xt6 Discover;
    public static final xt6 Mastercard;
    public static final xt6 TestEc;
    public static final xt6 TestRsa;
    public static final xt6 Visa;
    private final gn algorithm;
    private final String fileName;
    private final List<String> ids;
    private final foa keyUse;

    /* JADX WARN: Type inference failed for: r0v2, types: [wt6, java.lang.Object] */
    static {
        List c = eb4.c("F055545342");
        gn gnVar = gn.RSA;
        xt6 xt6Var = new xt6("TestRsa", 0, c, gnVar, "ds-test-rsa.txt");
        TestRsa = xt6Var;
        xt6 xt6Var2 = new xt6("TestEc", 1, eb4.c("F155545342"), gn.EC, "ds-test-ec.txt");
        TestEc = xt6Var2;
        xt6 xt6Var3 = new xt6("Visa", 2, eb4.c("A000000003"), gnVar, "ds-visa.crt");
        Visa = xt6Var3;
        xt6 xt6Var4 = new xt6("Mastercard", 3, eb4.c("A000000004"), gnVar, "ds-mastercard.crt");
        Mastercard = xt6Var4;
        xt6 xt6Var5 = new xt6("Amex", 4, eb4.c("A000000025"), gnVar, "ds-amex.pem");
        Amex = xt6Var5;
        xt6 xt6Var6 = new xt6("Discover", 5, CollectionsKt.listOf("A000000152", "A000000324"), gnVar, "ds-discover.cer", null);
        Discover = xt6Var6;
        xt6 xt6Var7 = new xt6("CartesBancaires", 6, eb4.c("A000000042"), gnVar, "ds-cartesbancaires.pem");
        CartesBancaires = xt6Var7;
        xt6[] xt6VarArr = {xt6Var, xt6Var2, xt6Var3, xt6Var4, xt6Var5, xt6Var6, xt6Var7};
        $VALUES = xt6VarArr;
        $ENTRIES = new wg7(xt6VarArr);
        Companion = new Object();
        CERTIFICATE_EXTENSIONS = ArraysKt.l0(new String[]{".crt", ".cer", ".pem"});
    }

    public xt6(String str, int i, List list, gn gnVar, String str2, foa foaVar) {
        this.ids = list;
        this.algorithm = gnVar;
        this.fileName = str2;
        this.keyUse = foaVar;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static xt6 valueOf(String str) {
        return (xt6) Enum.valueOf(xt6.class, str);
    }

    public static xt6[] values() {
        return (xt6[]) $VALUES.clone();
    }

    public final List b() {
        return this.ids;
    }

    public final foa c() {
        return this.keyUse;
    }

    public /* synthetic */ xt6(String str, int i, List list, gn gnVar, String str2) {
        this(str, i, list, gnVar, str2, foa.b);
    }
}
