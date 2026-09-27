package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sff implements fxg {
    public final String a;
    public final pw1 b;
    public final fw1 c;
    public final wma d;
    public final lod e;
    public final Integer f;

    public sff(String str, fw1 fw1Var, wma wmaVar, lod lodVar, Integer num) {
        this.a = str;
        this.b = q1k.b(str);
        this.c = fw1Var;
        this.d = wmaVar;
        this.e = lodVar;
        this.f = num;
    }

    public static sff a(String str, fw1 fw1Var, wma wmaVar, lod lodVar, Integer num) {
        if (lodVar == lod.RAW) {
            if (num != null) {
                fi9.r("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            fi9.r("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new sff(str, fw1Var, wmaVar, lodVar, num);
    }
}
