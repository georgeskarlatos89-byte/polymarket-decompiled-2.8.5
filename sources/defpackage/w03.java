package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w03 {
    public final ArrayList a;
    public final bx0 b;

    public w03(ArrayList arrayList, bx0 bx0Var) {
        this.a = arrayList;
        this.b = bx0Var;
        grn.b("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        boolean z = true;
        if (arrayList.size() != 1) {
            z = false;
        }
        grn.g("getInternalId() is only available for single-camera identifiers.", z);
        return (String) CollectionsKt.E(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w03) {
                w03 w03Var = (w03) obj;
                if (!Intrinsics.areEqual(this.a, w03Var.a) || !Intrinsics.areEqual(this.b, w03Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        bx0 bx0Var = this.b;
        if (bx0Var != null) {
            i = bx0Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(CollectionsKt.N(this.a, ",", null, null, null, 62));
        bx0 bx0Var = this.b;
        if (bx0Var != null) {
            str = ", compatId=" + bx0Var;
        } else {
            str = "";
        }
        return m51.m(sb, str, '}');
    }
}
