package okhttp3.internal;

import defpackage.lwg;
import defpackage.pwg;
import defpackage.vzm;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\f*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\f0\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\fH\u0016¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u0004\u0018\u0001H\f\"\b\b\u0001\u0010\f*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/LinkedTags;", "K", "", "Lokhttp3/internal/Tags;", "key", "Lkotlin/reflect/KClass;", "value", "next", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "Ljava/lang/Object;", "plus", "T", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "toString", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LinkedTags<K> extends Tags {
    private final KClass<K> key;
    private final Tags next;
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(KClass<K> kClass, K k, Tags tags) {
        super(null);
        kClass.getClass();
        k.getClass();
        tags.getClass();
        this.key = kClass;
        this.value = k;
        this.next = tags;
    }

    public static /* synthetic */ LinkedTags a(LinkedTags linkedTags) {
        return toString$lambda$0(linkedTags);
    }

    public static /* synthetic */ CharSequence b(LinkedTags linkedTags) {
        return toString$lambda$1(linkedTags);
    }

    private static final LinkedTags toString$lambda$0(LinkedTags linkedTags) {
        linkedTags.getClass();
        Tags tags = linkedTags.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    private static final CharSequence toString$lambda$1(LinkedTags linkedTags) {
        linkedTags.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(linkedTags.key);
        sb.append('=');
        sb.append(linkedTags.value);
        return sb.toString();
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(KClass<T> key) {
        key.getClass();
        if (Intrinsics.areEqual(key, this.key)) {
            return (T) vzm.m(key).cast(this.value);
        }
        return (T) this.next.get(key);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(KClass<T> key, T value) {
        key.getClass();
        boolean areEqual = Intrinsics.areEqual(key, this.key);
        Tags tags = this.next;
        if (!areEqual) {
            Tags plus = tags.plus(key, null);
            if (plus != this.next) {
                this = new LinkedTags<>(this.key, this.value, plus);
            }
            tags = this;
        }
        if (value != null) {
            return new LinkedTags(key, value, tags);
        }
        return tags;
    }

    public String toString() {
        final int i = 0;
        List s0 = CollectionsKt.s0(pwg.q(lwg.f(this, new Function1() { // from class: okhttp3.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (i) {
                    case 0:
                        return LinkedTags.a(linkedTags);
                    default:
                        return LinkedTags.b(linkedTags);
                }
            }
        })));
        final int i2 = 1;
        return CollectionsKt.N(s0, null, "{", "}", new Function1() { // from class: okhttp3.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (i2) {
                    case 0:
                        return LinkedTags.a(linkedTags);
                    default:
                        return LinkedTags.b(linkedTags);
                }
            }
        }, 25);
    }
}
