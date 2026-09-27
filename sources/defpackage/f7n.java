package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class f7n {
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mzj a(mzj mzjVar, j7e j7eVar, p5e p5eVar) {
        boolean z;
        String str;
        f7e f7eVar;
        String str2;
        String str3;
        hd hdVar;
        String str4;
        if (mzjVar instanceof kzj) {
            return mzjVar;
        }
        String str5 = null;
        if (mzjVar instanceof lzj) {
            lzj lzjVar = (lzj) mzjVar;
            String str6 = lzjVar.b;
            if (str6 != null) {
                z = true;
            } else {
                z = false;
            }
            if (str6 == null) {
                if (p5eVar != null) {
                    str6 = p5eVar.d;
                } else {
                    str = null;
                    if (!z) {
                        str5 = lzjVar.c;
                    } else {
                        if (j7eVar instanceof f7e) {
                            f7eVar = (f7e) j7eVar;
                        } else {
                            f7eVar = null;
                        }
                        if (f7eVar != null) {
                            str2 = f7eVar.c;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            if (p5eVar != null && (hdVar = p5eVar.a) != null) {
                                str5 = hdVar.b;
                            }
                        } else {
                            str3 = str2;
                            if (str != null) {
                                str4 = "PHONE_NUMBER";
                            } else {
                                str4 = "BILLING_ADDRESS";
                            }
                            String str7 = str4;
                            String str8 = lzjVar.a;
                            String str9 = lzjVar.d;
                            f6h f6hVar = lzjVar.e;
                            str8.getClass();
                            f6hVar.getClass();
                            return new lzj(str8, str, str3, str9, f6hVar, str7);
                        }
                    }
                    str3 = str5;
                    if (str != null) {
                    }
                    String str72 = str4;
                    String str82 = lzjVar.a;
                    String str92 = lzjVar.d;
                    f6h f6hVar2 = lzjVar.e;
                    str82.getClass();
                    f6hVar2.getClass();
                    return new lzj(str82, str, str3, str92, f6hVar2, str72);
                }
            }
            str = str6;
            if (!z) {
            }
            str3 = str5;
            if (str != null) {
            }
            String str722 = str4;
            String str822 = lzjVar.a;
            String str922 = lzjVar.d;
            f6h f6hVar22 = lzjVar.e;
            str822.getClass();
            f6hVar22.getClass();
            return new lzj(str822, str, str3, str922, f6hVar22, str722);
        }
        dmk.a();
        return null;
    }

    public static final oz9 b(fz9 fz9Var) {
        return new oz9(fz9Var.a, fz9Var.b, fz9Var.c, fz9Var.d);
    }
}
