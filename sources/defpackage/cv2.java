package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface cv2 {
    Object await(Continuation continuation);

    void cancel();

    void enqueue();

    void enqueue(zu2 zu2Var);

    w5g execute();
}
