package skip.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.MutableStruct;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u001f\u001a\u00020\u0001H\u0016R$\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lskip/foundation/ObjCBool;", "Lskip/lib/MutableStruct;", "value", "", "<init>", "(Z)V", "booleanLiteral", "unusedp_0", "", "(ZLjava/lang/Void;)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "boolValue", "getBoolValue", "()Z", "setBoolValue", "supdate", "Lkotlin/Function1;", "", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObjCBool implements MutableStruct {
    private boolean boolValue;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ObjCBool(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        setBoolValue(((ObjCBool) mutableStruct).boolValue);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public final boolean getBoolValue() {
        return this.boolValue;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ObjCBool(this);
    }

    public final void setBoolValue(boolean z) {
        willmutate();
        this.boolValue = z;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public ObjCBool(boolean z, Void r2) {
        setBoolValue(z);
    }

    public /* synthetic */ ObjCBool(boolean z, Void r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : r2);
    }

    public ObjCBool(boolean z) {
        setBoolValue(z);
    }
}
