package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x01 implements Function0 {
    public static final x01 b = new x01(0);
    public static final x01 c = new x01(1);
    public static final x01 d = new x01(2);
    public static final x01 e = new x01(3);
    public static final x01 f = new x01(4);
    public static final x01 g = new x01(5);
    public static final x01 h = new x01(6);
    public static final x01 i = new x01(7);
    public static final x01 j = new x01(8);
    public static final x01 k = new x01(9);
    public static final x01 l = new x01(10);
    public static final x01 m = new x01(11);
    public static final x01 n = new x01(12);
    public static final x01 o = new x01(13);
    public static final x01 p = new x01(14);
    public static final x01 q = new x01(15);
    public static final x01 r = new x01(16);
    public static final x01 s = new x01(17);
    public static final x01 t = new x01(18);
    public static final x01 u = new x01(19);
    public final /* synthetic */ int a;

    public x01(s1a s1aVar) {
        this.a = 21;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ib4(hpn.b(1308617531));
            case 1:
                xq1 xq1Var = xq1.a;
                ServiceLoader load = ServiceLoader.load(yq1.class, yq1.class.getClassLoader());
                load.getClass();
                yq1 yq1Var = (yq1) CollectionsKt.F(load);
                if (yq1Var != null) {
                    return yq1Var;
                }
                dmk.n("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new ib4(ib4.b(ib4.b, 0.08f, 0.0f, 0.0f, 0.0f, 14));
            case 3:
                return new ib4(ib4.b(ib4.b, 0.16f, 0.0f, 0.0f, 0.0f, 14));
            case 4:
                return new ib4(ib4.b(ib4.b, 0.06f, 0.0f, 0.0f, 0.0f, 14));
            case 5:
                return new ib4(ib4.b);
            case 6:
                return new ib4(ib4.b);
            case 7:
                return "Failed to serialize data to JSON";
            case 8:
                ksa ksaVar = new ksa(new nqb("DefaultBuiltIns"));
                ksaVar.c();
                return ksaVar;
            case 9:
                Set set = uo6.b;
                return CollectionsKt.emptyList();
            case 10:
                yi7 yi7Var = yi7.a;
                return (xz5) xz5.f.getValue();
            case 11:
                vka[] vkaVarArr = dba.g;
                return c1c.b(new Pair(saa.a, new gy4("Deprecated in Java")));
            case 12:
                dfc dfcVar = dfc.a;
                ServiceLoader load2 = ServiceLoader.load(efc.class, efc.class.getClassLoader());
                load2.getClass();
                List M0 = CollectionsKt.M0(load2);
                if (!M0.isEmpty()) {
                    return M0;
                }
                dmk.n("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 13:
                return new ib4(ib4.b(ib4.b, 0.06f, 0.0f, 0.0f, 0.0f, 14));
            case 14:
                return new ib4(ib4.b(ib4.b, 0.025f, 0.0f, 0.0f, 0.0f, 14));
            case 15:
                return null;
            case 16:
                return "There is more input to consume";
            case 17:
                return new ib4(ib4.b(ib4.b, 0.08f, 0.0f, 0.0f, 0.0f, 14));
            case MlKitException.UNSUPPORTED /* 18 */:
                return new ib4(ib4.b(ib4.b, 0.12f, 0.0f, 0.0f, 0.0f, 14));
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new ib4(ib4.b(ib4.b, 0.1f, 0.0f, 0.0f, 0.0f, 14));
            case 20:
                return new ib4(ib4.b(ib4.b, 0.04f, 0.0f, 0.0f, 0.0f, 14));
            default:
                throw null;
        }
    }

    public /* synthetic */ x01(int i2) {
        this.a = i2;
    }
}
