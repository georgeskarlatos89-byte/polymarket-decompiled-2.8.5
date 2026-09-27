package defpackage;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class okj extends e0d {
    public static final okj b = new okj(false, 0);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ okj(boolean z, int i) {
        super(z);
        this.a = i;
    }

    @Override // defpackage.e0d
    public final Object get(Bundle bundle, String str) {
        switch (this.a) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!iyn.a(bundle, str) || iyn.m(bundle, str)) {
                    return null;
                }
                return Boolean.valueOf(iyn.c(bundle, str));
            case 2:
                bundle.getClass();
                str.getClass();
                if (!iyn.a(bundle, str) || iyn.m(bundle, str)) {
                    return null;
                }
                return Double.valueOf(iyn.d(bundle, str));
            case 3:
                bundle.getClass();
                str.getClass();
                return Double.valueOf(iyn.d(bundle, str));
            case 4:
                bundle.getClass();
                str.getClass();
                if (!iyn.a(bundle, str) || iyn.m(bundle, str)) {
                    return null;
                }
                return Float.valueOf(iyn.e(bundle, str));
            case 5:
                bundle.getClass();
                str.getClass();
                if (!iyn.a(bundle, str) || iyn.m(bundle, str)) {
                    return null;
                }
                return Integer.valueOf(iyn.f(bundle, str));
            case 6:
                bundle.getClass();
                str.getClass();
                if (!iyn.a(bundle, str) || iyn.m(bundle, str)) {
                    return null;
                }
                return Long.valueOf(iyn.h(bundle, str));
            default:
                bundle.getClass();
                str.getClass();
                if (iyn.a(bundle, str) && !iyn.m(bundle, str)) {
                    return iyn.j(bundle, str);
                }
                return "null";
        }
    }

    @Override // defpackage.e0d
    public final String getName() {
        switch (this.a) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // defpackage.e0d
    public final Object parseValue(String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                return "null";
            case 1:
                str.getClass();
                if (Intrinsics.areEqual(str, "null")) {
                    return null;
                }
                return (Boolean) e0d.BoolType.parseValue(str);
            case 2:
                str.getClass();
                if (Intrinsics.areEqual(str, "null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                str.getClass();
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                str.getClass();
                if (Intrinsics.areEqual(str, "null")) {
                    return null;
                }
                return (Float) e0d.FloatType.parseValue(str);
            case 5:
                str.getClass();
                if (Intrinsics.areEqual(str, "null")) {
                    return null;
                }
                return (Integer) e0d.IntType.parseValue(str);
            case 6:
                str.getClass();
                if (Intrinsics.areEqual(str, "null")) {
                    return null;
                }
                return (Long) e0d.LongType.parseValue(str);
            default:
                str.getClass();
                return str;
        }
    }

    @Override // defpackage.e0d
    public final void put(Bundle bundle, String str, Object obj) {
        switch (this.a) {
            case 0:
                bundle.getClass();
                str.getClass();
                ((String) obj).getClass();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                bundle.getClass();
                str.getClass();
                if (bool == null) {
                    nyn.c(bundle, str);
                    return;
                } else {
                    e0d.BoolType.put(bundle, str, bool);
                    return;
                }
            case 2:
                Double d = (Double) obj;
                bundle.getClass();
                str.getClass();
                if (d == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    bundle.putDouble(str, d.doubleValue());
                    return;
                }
            case 3:
                double doubleValue = ((Number) obj).doubleValue();
                bundle.getClass();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                return;
            case 4:
                Float f = (Float) obj;
                bundle.getClass();
                str.getClass();
                if (f == null) {
                    nyn.c(bundle, str);
                    return;
                } else {
                    e0d.FloatType.put(bundle, str, f);
                    return;
                }
            case 5:
                Integer num = (Integer) obj;
                bundle.getClass();
                str.getClass();
                if (num == null) {
                    nyn.c(bundle, str);
                    return;
                } else {
                    e0d.IntType.put(bundle, str, num);
                    return;
                }
            case 6:
                Long l = (Long) obj;
                bundle.getClass();
                str.getClass();
                if (l == null) {
                    nyn.c(bundle, str);
                    return;
                } else {
                    e0d.LongType.put(bundle, str, l);
                    return;
                }
            default:
                String str2 = (String) obj;
                bundle.getClass();
                str.getClass();
                str2.getClass();
                nyn.f(bundle, str, str2);
                return;
        }
    }

    @Override // defpackage.e0d
    public String serializeAsValue(Object obj) {
        switch (this.a) {
            case 7:
                String str = (String) obj;
                str.getClass();
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.serializeAsValue(obj);
        }
    }
}
