package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fkf {
    public final ArrayList a;
    public final m1f b;

    public fkf(ArrayList arrayList, m1f m1fVar) {
        this.a = arrayList;
        this.b = m1fVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fkf) {
                fkf fkfVar = (fkf) obj;
                if (!Intrinsics.areEqual(this.a, fkfVar.a) || !Intrinsics.areEqual(this.b, fkfVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        m1f m1fVar = this.b;
        if (m1fVar == null) {
            hashCode = 0;
        } else {
            hashCode = m1fVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "QueryChannelsResult(channels=" + this.a + ", predefinedFilter=" + this.b + ")";
    }
}
