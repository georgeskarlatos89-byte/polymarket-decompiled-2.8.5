package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class mp4 {
    public final ArrayList a = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, vr8 vr8Var, Object obj) {
        ArrayList arrayList = vr8Var.a;
        if (arrayList == null) {
            b(i, vr8Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (obj2 instanceof nr8) {
                if (Intrinsics.areEqual(obj2, obj)) {
                    b(0, vr8Var, obj2);
                    return true;
                }
            } else if (obj2 instanceof vr8) {
                if (a(i, (vr8) obj2, obj)) {
                    b(0, vr8Var, obj2);
                    return true;
                }
            } else {
                dmk.n(k84.u(obj2, "Unexpected child source info "));
                break;
            }
            i2++;
        }
    }

    public final void b(int i, vr8 vr8Var, Object obj) {
        this.a.add(new op4(i, null, null));
    }

    public final void c(int i, Object obj, vr8 vr8Var, Object obj2) {
        if (!Intrinsics.areEqual(obj, oq4.a)) {
            return;
        }
        b(i, vr8Var, null);
    }
}
