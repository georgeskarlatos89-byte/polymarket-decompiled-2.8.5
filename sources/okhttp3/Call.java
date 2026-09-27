package okhttp3;

import defpackage.b3j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001(J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000 H&¢\u0006\u0004\b\u001e\u0010!J5\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H&¢\u0006\u0004\b\u001e\u0010$J5\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H&¢\u0006\u0004\b\u001e\u0010%J\u000f\u0010&\u001a\u00020\u0000H&¢\u0006\u0004\b&\u0010'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "", "enqueue", "(Lokhttp3/Callback;)V", "cancel", "()V", "", "isExecuted", "()Z", "isCanceled", "Lb3j;", "timeout", "()Lb3j;", "Lokhttp3/EventListener;", "eventListener", "addEventListener", "(Lokhttp3/EventListener;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "tag", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "Factory", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Call extends Cloneable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lokhttp3/Call$Factory;", "", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void addEventListener(EventListener eventListener);

    void cancel();

    /* renamed from: clone */
    Call mo1039clone();

    void enqueue(Callback responseCallback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    <T> T tag(Class<? extends T> type);

    <T> T tag(Class<T> type, Function0<? extends T> computeIfAbsent);

    <T> T tag(KClass<T> type);

    <T> T tag(KClass<T> type, Function0<? extends T> computeIfAbsent);

    b3j timeout();
}
