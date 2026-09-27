package skip.lib;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"dictionaryOf", "Lskip/lib/Dictionary;", "K", "V", "entries", "", "Lskip/lib/Tuple2;", "([Lskip/lib/Tuple2;)Lskip/lib/Dictionary;", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DictionaryKt {
    public static final <K, V> Dictionary<K, V> dictionaryOf(Tuple2<K, V>... tuple2Arr) {
        tuple2Arr.getClass();
        Dictionary<K, V> dictionary = new Dictionary<>(0, 1, (DefaultConstructorMarker) null);
        for (Tuple2<K, V> tuple2 : tuple2Arr) {
            dictionary.put(tuple2.getElement0(), tuple2.getElement1());
        }
        return dictionary;
    }
}
