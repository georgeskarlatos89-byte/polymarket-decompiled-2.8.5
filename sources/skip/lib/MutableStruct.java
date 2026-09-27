package skip.lib;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0000H&J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R&\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lskip/lib/MutableStruct;", "", "scopy", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "willmutate", "didmutate", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MutableStruct {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void didmutate(MutableStruct mutableStruct) {
            MutableStruct.access$didmutate$jd(mutableStruct);
        }

        @Deprecated
        public static void willmutate(MutableStruct mutableStruct) {
            MutableStruct.access$willmutate$jd(mutableStruct);
        }
    }

    static /* synthetic */ void access$didmutate$jd(MutableStruct mutableStruct) {
        super.didmutate();
    }

    static /* synthetic */ void access$willmutate$jd(MutableStruct mutableStruct) {
        super.willmutate();
    }

    default void didmutate() {
        Function1<Object, Unit> supdate;
        setSmutatingcount(getSmutatingcount() - 1);
        if (getSmutatingcount() <= 0 && (supdate = getSupdate()) != null) {
            supdate.invoke(this);
        }
    }

    int getSmutatingcount();

    Function1<Object, Unit> getSupdate();

    MutableStruct scopy();

    void setSmutatingcount(int i);

    void setSupdate(Function1<Object, Unit> function1);

    default void willmutate() {
        setSmutatingcount(getSmutatingcount() + 1);
    }
}
