package skip.foundation;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.fad;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Dictionary;
import skip.lib.Hasher;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0002,-B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\b\u0010'\u001a\u00020\u0001H\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010+\u001a\u00020\"H\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015RJ\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006."}, d2 = {"Lskip/foundation/Notification;", "Lskip/lib/MutableStruct;", Keys.KEY_NAME, "Lskip/foundation/Notification$Name;", "object_", "", "userInfo", "Lskip/lib/Dictionary;", "Lskip/lib/AnyHashable;", "<init>", "(Lskip/foundation/Notification$Name;Ljava/lang/Object;Lskip/lib/Dictionary;)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "getName", "()Lskip/foundation/Notification$Name;", "setName", "(Lskip/foundation/Notification$Name;)V", "getObject_", "()Ljava/lang/Object;", "setObject_", "(Ljava/lang/Object;)V", "getUserInfo", "()Lskip/lib/Dictionary;", "setUserInfo", "(Lskip/lib/Dictionary;)V", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "hashCode", "Name", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Notification implements MutableStruct {
    private Name name;
    private Object object_;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;
    private Dictionary<Object, Object> userInfo;

    private Notification(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        Notification notification = (Notification) mutableStruct;
        setName(notification.name);
        setObject_(notification.getObject_());
        setUserInfo(notification.getUserInfo());
    }

    private static final Unit _get_object__$lambda$0(Notification notification, Object obj) {
        notification.setObject_(obj);
        return Unit.INSTANCE;
    }

    private static final Unit _get_userInfo_$lambda$1(Notification notification, Dictionary dictionary) {
        notification.setUserInfo(dictionary);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(Notification notification, Object obj) {
        return _get_object__$lambda$0(notification, obj);
    }

    public static /* synthetic */ Unit b(Notification notification, Dictionary dictionary) {
        return _get_userInfo_$lambda$1(notification, dictionary);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) other;
        if (!Intrinsics.areEqual(this.name, notification.name) || !Intrinsics.areEqual(getObject_(), notification.getObject_()) || !Intrinsics.areEqual(getUserInfo(), notification.getUserInfo())) {
            return false;
        }
        return true;
    }

    public final Name getName() {
        return this.name;
    }

    public final Object getObject_() {
        return StructKt.sref(this.object_, new fad(this, 1));
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final Dictionary<Object, Object> getUserInfo() {
        return (Dictionary) StructKt.sref(this.userInfo, new fad(this, 0));
    }

    public int hashCode() {
        Hasher.Companion companion = Hasher.INSTANCE;
        return companion.combine(companion.combine(companion.combine(1, this.name), getObject_()), getUserInfo());
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new Notification(this);
    }

    public final void setName(Name name) {
        name.getClass();
        willmutate();
        this.name = name;
        didmutate();
    }

    public final void setObject_(Object obj) {
        Object sref$default = StructKt.sref$default(obj, null, 1, null);
        willmutate();
        this.object_ = sref$default;
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

    public final void setUserInfo(Dictionary<Object, Object> dictionary) {
        Dictionary<Object, Object> dictionary2 = (Dictionary) StructKt.sref$default(dictionary, null, 1, null);
        willmutate();
        this.userInfo = dictionary2;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lskip/foundation/Notification$Name;", "Lskip/lib/RawRepresentable;", "", "rawValue", "unusedp_0", "", "<init>", "(Ljava/lang/String;Ljava/lang/Void;)V", "value", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Name implements RawRepresentable<String> {
        private final String rawValue;

        public Name(String str, Void r2) {
            str.getClass();
            this.rawValue = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof Name)) {
                return false;
            }
            return Intrinsics.areEqual(getRawValue(), ((Name) other).getRawValue());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, getRawValue());
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        public /* synthetic */ Name(String str, Void r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : r2);
        }

        public Name(String str) {
            str.getClass();
            this.rawValue = str;
        }
    }

    public /* synthetic */ Notification(Name name, Object obj, Dictionary dictionary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : dictionary);
    }

    public Notification(Name name, Object obj, Dictionary<Object, Object> dictionary) {
        name.getClass();
        setName(name);
        setObject_(obj);
        setUserInfo(dictionary);
    }
}
