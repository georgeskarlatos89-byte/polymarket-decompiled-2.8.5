package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lskip/lib/ObjectIdentifier;", "", "object_", "<init>", "(Ljava/lang/Object;)V", "getObject_$SkipLib", "()Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ObjectIdentifier {
    private final Object object_;

    public ObjectIdentifier(Object obj) {
        obj.getClass();
        this.object_ = StructKt.sref$default(obj, null, 1, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof ObjectIdentifier) || this.object_ != ((ObjectIdentifier) other).object_) {
            return false;
        }
        return true;
    }

    /* renamed from: getObject_$SkipLib, reason: from getter */
    public final Object getObject_() {
        return this.object_;
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, this.object_);
    }
}
