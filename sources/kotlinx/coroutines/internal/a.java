package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ThreadState threadState = (ThreadState) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (element instanceof ThreadContextElement) {
            ThreadContextElement threadContextElement = (ThreadContextElement) element;
            CoroutineContext coroutineContext = threadState.a;
            Object i0 = threadContextElement.i0();
            Object[] objArr = threadState.b;
            int i = threadState.d;
            objArr[i] = i0;
            ThreadContextElement[] threadContextElementArr = threadState.c;
            threadState.d = i + 1;
            threadContextElementArr[i] = threadContextElement;
        }
        return threadState;
    }
}
