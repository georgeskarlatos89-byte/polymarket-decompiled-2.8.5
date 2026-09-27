package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bpb {
    public final v0h a;
    public final Collection b;
    public final Collection c;

    public bpb(v0h v0hVar, Collection collection, Collection collection2) {
        v0hVar.getClass();
        collection.getClass();
        collection2.getClass();
        this.a = v0hVar;
        this.b = collection;
        this.c = collection2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpb)) {
            return false;
        }
        bpb bpbVar = (bpb) obj;
        if (Intrinsics.areEqual(this.a, bpbVar.a) && Intrinsics.areEqual(this.b, bpbVar.b) && Intrinsics.areEqual(this.c, bpbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.a + ", parsedNodes=" + this.b + ", rangesToProcessFurther=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpb(v0h v0hVar, Collection collection, ArrayList arrayList) {
        this(v0hVar, collection, eb4.c(arrayList));
        collection.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpb(v0h v0hVar, Collection collection) {
        this(v0hVar, collection, CollectionsKt.emptyList());
        collection.getClass();
    }
}
