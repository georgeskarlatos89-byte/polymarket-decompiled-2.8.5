package skip.lib;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lskip/lib/AsyncIteratorProtocol;", "Element", "", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AsyncIteratorProtocol<Element> {
    Object next(Continuation<? super Element> continuation);
}
