package coil3.compose;

import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.jn0;
import defpackage.qtd;
import defpackage.zbi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil3/compose/AsyncImagePainter$State$Success", "Ljn0;", "Lqtd;", PlaceTypes.PAINTER, "Lqtd;", "a", "()Lqtd;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AsyncImagePainter$State$Success implements jn0 {
    public final zbi a;
    private final qtd painter;

    public AsyncImagePainter$State$Success(qtd qtdVar, zbi zbiVar) {
        this.painter = qtdVar;
        this.a = zbiVar;
    }

    @Override // defpackage.jn0
    /* renamed from: a, reason: from getter */
    public final qtd getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AsyncImagePainter$State$Success) {
                AsyncImagePainter$State$Success asyncImagePainter$State$Success = (AsyncImagePainter$State$Success) obj;
                if (!Intrinsics.areEqual(this.painter, asyncImagePainter$State$Success.painter) || !Intrinsics.areEqual(this.a, asyncImagePainter$State$Success.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.painter.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.a + ")";
    }
}
