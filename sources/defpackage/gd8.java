package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gd8 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ gd8(Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = objectRef;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Ref.ObjectRef objectRef = this.b;
        switch (i) {
            case 0:
                objectRef.a = obj;
                throw new i0(this);
            default:
                objectRef.a = obj;
                throw new i0(this);
        }
    }
}
