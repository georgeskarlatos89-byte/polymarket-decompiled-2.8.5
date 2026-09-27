package skip.lib;

import defpackage.dmk;
import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00028\u0000H\u0086B¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lskip/lib/AsyncSequenceIterator;", "Element", "", "iter", "Lskip/lib/AsyncIteratorProtocol;", "<init>", "(Lskip/lib/AsyncIteratorProtocol;)V", "cachedNext", "Ljava/lang/Object;", "hasCachedNext", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncSequenceIterator<Element> {
    private Element cachedNext;
    private boolean hasCachedNext;
    private final AsyncIteratorProtocol<Element> iter;

    public AsyncSequenceIterator(AsyncIteratorProtocol<Element> asyncIteratorProtocol) {
        asyncIteratorProtocol.getClass();
        this.iter = asyncIteratorProtocol;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasNext(Continuation<? super Boolean> continuation) {
        AsyncSequenceIterator$hasNext$1 asyncSequenceIterator$hasNext$1;
        int i;
        AsyncSequenceIterator<Element> asyncSequenceIterator;
        if (continuation instanceof AsyncSequenceIterator$hasNext$1) {
            asyncSequenceIterator$hasNext$1 = (AsyncSequenceIterator$hasNext$1) continuation;
            int i2 = asyncSequenceIterator$hasNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequenceIterator$hasNext$1.label = i2 - Integer.MIN_VALUE;
                Element element = (Element) asyncSequenceIterator$hasNext$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = asyncSequenceIterator$hasNext$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        asyncSequenceIterator = (AsyncSequenceIterator) asyncSequenceIterator$hasNext$1.L$0;
                        kotlin.ResultKt.a(element);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    kotlin.ResultKt.a(element);
                    if (!this.hasCachedNext) {
                        AsyncIteratorProtocol<Element> asyncIteratorProtocol = this.iter;
                        asyncSequenceIterator$hasNext$1.L$0 = this;
                        asyncSequenceIterator$hasNext$1.label = 1;
                        element = (Element) asyncIteratorProtocol.next(asyncSequenceIterator$hasNext$1);
                        if (element == u85Var) {
                            return u85Var;
                        }
                        asyncSequenceIterator = this;
                    }
                    if (this.cachedNext == null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                asyncSequenceIterator.cachedNext = element;
                this.hasCachedNext = true;
                if (this.cachedNext == null) {
                }
                return Boolean.valueOf(z);
            }
        }
        asyncSequenceIterator$hasNext$1 = new AsyncSequenceIterator$hasNext$1(this, continuation);
        Element element2 = (Element) asyncSequenceIterator$hasNext$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = asyncSequenceIterator$hasNext$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
        asyncSequenceIterator.cachedNext = element2;
        this.hasCachedNext = true;
        if (this.cachedNext == null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object next(Continuation<? super Element> continuation) {
        AsyncSequenceIterator$next$1 asyncSequenceIterator$next$1;
        int i;
        if (continuation instanceof AsyncSequenceIterator$next$1) {
            asyncSequenceIterator$next$1 = (AsyncSequenceIterator$next$1) continuation;
            int i2 = asyncSequenceIterator$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequenceIterator$next$1.label = i2 - Integer.MIN_VALUE;
                Object obj = asyncSequenceIterator$next$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = asyncSequenceIterator$next$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    kotlin.ResultKt.a(obj);
                    if (this.hasCachedNext) {
                        Element element = this.cachedNext;
                        element.getClass();
                        this.cachedNext = null;
                        this.hasCachedNext = false;
                        return element;
                    }
                    AsyncIteratorProtocol<Element> asyncIteratorProtocol = this.iter;
                    asyncSequenceIterator$next$1.label = 1;
                    obj = asyncIteratorProtocol.next(asyncSequenceIterator$next$1);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        asyncSequenceIterator$next$1 = new AsyncSequenceIterator$next$1(this, continuation);
        Object obj2 = asyncSequenceIterator$next$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = asyncSequenceIterator$next$1.label;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
