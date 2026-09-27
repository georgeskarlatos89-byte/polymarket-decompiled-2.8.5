package coil.compose;

import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.kn0;
import defpackage.qtd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil/compose/AsyncImagePainter$State$Loading", "Lkn0;", "Lqtd;", PlaceTypes.PAINTER, "Lqtd;", "a", "()Lqtd;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AsyncImagePainter$State$Loading extends kn0 {
    private final qtd painter;

    public AsyncImagePainter$State$Loading(qtd qtdVar) {
        this.painter = qtdVar;
    }

    @Override // defpackage.kn0
    /* renamed from: a, reason: from getter */
    public final qtd getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AsyncImagePainter$State$Loading) && Intrinsics.areEqual(this.painter, ((AsyncImagePainter$State$Loading) obj).painter)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        qtd qtdVar = this.painter;
        if (qtdVar == null) {
            return 0;
        }
        return qtdVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.painter + ')';
    }
}
