package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface azi {
    Object deleteAll(Continuation continuation);

    Object deleteThreads(String str, Continuation continuation);

    Object insertThread(czi cziVar, Continuation continuation);

    Object insertThreads(List list, Continuation continuation);

    Object selectThread(String str, Continuation continuation);

    Object selectThreads(Collection collection, Continuation continuation);
}
