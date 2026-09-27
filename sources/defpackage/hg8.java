package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hg8 {
    public static final hg8 b = new hg8();
    public static final hg8 c = new hg8();
    public static final hg8 d = new hg8();
    public final zqc a = new zqc(new jg8[16]);

    /* JADX WARN: Code restructure failed: missing block: B:71:0x004c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(hg8 hg8Var) {
        hg8Var.getClass();
        if (hg8Var != b) {
            if (hg8Var != c) {
                zqc zqcVar = hg8Var.a;
                int i = zqcVar.c;
                if (i == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    return false;
                }
                Object[] objArr = zqcVar.a;
                boolean z = false;
                for (int i2 = 0; i2 < i; i2++) {
                    mj6 mj6Var = (jg8) objArr[i2];
                    if (!((jjc) mj6Var).a.n) {
                        kw9.c("visitChildren called on an unattached node");
                    }
                    zqc zqcVar2 = new zqc(new jjc[16]);
                    jjc jjcVar = ((jjc) mj6Var).a;
                    jjc jjcVar2 = jjcVar.f;
                    if (jjcVar2 == null) {
                        nj6.a(zqcVar2, jjcVar);
                    } else {
                        zqcVar2.b(jjcVar2);
                    }
                    while (true) {
                        int i3 = zqcVar2.c;
                        if (i3 != 0) {
                            jjc jjcVar3 = (jjc) zqcVar2.k(i3 - 1);
                            if ((jjcVar3.d & Barcode.FORMAT_UPC_E) == 0) {
                                nj6.a(zqcVar2, jjcVar3);
                            } else {
                                while (true) {
                                    if (jjcVar3 == null) {
                                        break;
                                    }
                                    if ((jjcVar3.c & Barcode.FORMAT_UPC_E) != 0) {
                                        zqc zqcVar3 = null;
                                        while (jjcVar3 != null) {
                                            if (jjcVar3 instanceof yg8) {
                                                if (((yg8) jjcVar3).j1(7)) {
                                                    z = true;
                                                    break;
                                                }
                                            } else if ((jjcVar3.c & Barcode.FORMAT_UPC_E) != 0 && (jjcVar3 instanceof vj6)) {
                                                int i4 = 0;
                                                for (jjc jjcVar4 = ((vj6) jjcVar3).p; jjcVar4 != null; jjcVar4 = jjcVar4.f) {
                                                    if ((jjcVar4.c & Barcode.FORMAT_UPC_E) != 0) {
                                                        i4++;
                                                        if (i4 == 1) {
                                                            jjcVar3 = jjcVar4;
                                                        } else {
                                                            if (zqcVar3 == null) {
                                                                zqcVar3 = new zqc(new jjc[16]);
                                                            }
                                                            if (jjcVar3 != null) {
                                                                zqcVar3.b(jjcVar3);
                                                                jjcVar3 = null;
                                                            }
                                                            zqcVar3.b(jjcVar4);
                                                        }
                                                    }
                                                }
                                                if (i4 == 1) {
                                                }
                                            }
                                            jjcVar3 = nj6.c(zqcVar3);
                                        }
                                    } else {
                                        jjcVar3 = jjcVar3.f;
                                    }
                                }
                            }
                        }
                    }
                }
                return z;
            }
            dmk.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        dmk.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        return false;
    }
}
