package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pig {
    public final ArrayList a;
    public final ArrayList b;
    public final jig c;
    public final ArrayList d;

    public pig(ArrayList arrayList, ArrayList arrayList2, jig jigVar, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = jigVar;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pig.class == obj.getClass()) {
                pig pigVar = (pig) obj;
                if (Intrinsics.areEqual(this.a, pigVar.a) && Intrinsics.areEqual(this.b, pigVar.b) && Intrinsics.areEqual(this.c, pigVar.c) && Intrinsics.areEqual(this.d, pigVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ')';
    }
}
