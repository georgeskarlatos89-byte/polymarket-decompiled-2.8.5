package skip.lib;

import defpackage.xja;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Dictionary;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"skip/lib/Dictionary$EntryCollection$iterator$1", "", "Lskip/lib/Tuple2;", "lastEntry", "", "hasNext", "", "next", "remove", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Dictionary$EntryCollection$iterator$1<K, V> implements Iterator<Tuple2<K, V>>, xja {
    final /* synthetic */ Iterator<Map.Entry<K, V>> $storageIterator;
    private Map.Entry<K, V> lastEntry;
    final /* synthetic */ Dictionary.EntryCollection<K, V> this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public Dictionary$EntryCollection$iterator$1(Iterator<? extends Map.Entry<K, V>> it, Dictionary.EntryCollection<K, V> entryCollection) {
        this.$storageIterator = it;
        this.this$0 = entryCollection;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$storageIterator.hasNext();
    }

    @Override // java.util.Iterator
    public Tuple2<K, V> next() {
        Map.Entry<K, V> next = this.$storageIterator.next();
        this.lastEntry = next;
        if (next != null) {
            K key = next.getKey();
            Map.Entry<K, V> entry = this.lastEntry;
            if (entry != null) {
                return new Tuple2<>(key, entry.getValue());
            }
            Intrinsics.i("lastEntry");
            throw null;
        }
        Intrinsics.i("lastEntry");
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        LinkedHashMap<K, V> storage$SkipLib = this.this$0.getDictionary().getStorage$SkipLib();
        Map.Entry<K, V> entry = this.lastEntry;
        if (entry != null) {
            storage$SkipLib.remove(entry.getKey());
        } else {
            Intrinsics.i("lastEntry");
            throw null;
        }
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
