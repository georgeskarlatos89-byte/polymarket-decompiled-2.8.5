package defpackage;

import com.google.mlkit.common.MlKitException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class tpd implements Function1 {
    public final /* synthetic */ int a;
    public static final tpd b = new tpd(0);
    public static final tpd c = new tpd(1);
    public static final tpd d = new tpd(2);
    public static final tpd e = new tpd(3);
    public static final tpd f = new tpd(4);
    public static final tpd g = new tpd(5);
    public static final tpd h = new tpd(6);
    public static final tpd i = new tpd(7);
    public static final tpd j = new tpd(8);
    public static final tpd k = new tpd(9);
    public static final tpd l = new tpd(10);
    public static final tpd m = new tpd(11);
    public static final tpd n = new tpd(12);
    public static final tpd o = new tpd(13);
    public static final tpd p = new tpd(14);
    public static final tpd q = new tpd(15);
    public static final tpd r = new tpd(16);
    public static final tpd s = new tpd(17);
    public static final tpd t = new tpd(18);
    public static final tpd u = new tpd(19);
    public static final tpd v = new tpd(20);
    public static final tpd w = new tpd(21);
    public static final tpd x = new tpd(22);
    public static final tpd y = new tpd(23);
    public static final tpd z = new tpd(24);
    public static final tpd A = new tpd(25);
    public static final tpd B = new tpd(26);
    public static final tpd C = new tpd(27);
    public static final tpd D = new tpd(28);
    public static final tpd E = new tpd(29);

    public /* synthetic */ tpd(int i2) {
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.a) {
            case 0:
                rpd rpdVar = (rpd) obj;
                rpdVar.getClass();
                return ((spd) rpdVar).e;
            case 1:
                return obj.toString();
            case 2:
                return obj.toString();
            case 3:
                return obj.toString();
            case 4:
                return obj.toString();
            case 5:
                return obj.toString();
            case 6:
                return obj.toString();
            case 7:
                return obj.toString();
            case 8:
                return obj.toString();
            case 9:
                return obj.toString();
            case 10:
                return obj.toString();
            case 11:
                return obj.toString();
            case 12:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            case 13:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = buf.a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (!(ownerType instanceof ParameterizedType)) {
                    return null;
                }
                return (ParameterizedType) ownerType;
            case 14:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = buf.a;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return ArraysKt.g(actualTypeArguments);
            case 15:
                if (((Class) obj).getSimpleName().length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 16:
                String simpleName = ((Class) obj).getSimpleName();
                if (!csc.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName == null) {
                    return null;
                }
                return csc.e(simpleName);
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case MlKitException.UNSUPPORTED /* 18 */:
                ksa ksaVar = (ksa) obj;
                x6g x6gVar = x6g.c;
                ksaVar.getClass();
                return ksaVar.s(c6f.BOOLEAN);
            case zh4.REMOTE_EXCEPTION /* 19 */:
                ksa ksaVar2 = (ksa) obj;
                y6g y6gVar = y6g.c;
                ksaVar2.getClass();
                return ksaVar2.s(c6f.INT);
            case 20:
                ksa ksaVar3 = (ksa) obj;
                z6g z6gVar = z6g.c;
                ksaVar3.getClass();
                return ksaVar3.w();
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                pug pugVar = (pug) obj;
                pugVar.getClass();
                nug.a(pugVar);
                return Unit.INSTANCE;
            case 22:
                if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                    return new ib4(ib4.m);
                }
                obj.getClass();
                return new ib4(hpn.b(((Integer) obj).intValue()));
            case 23:
                return obj.toString();
            case 24:
                return obj.toString();
            case 25:
                return obj.toString();
            case 26:
                return obj.toString();
            case 27:
                return obj.toString();
            case 28:
                return obj.toString();
            default:
                return obj.toString();
        }
    }
}
