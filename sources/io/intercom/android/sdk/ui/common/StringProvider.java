package io.intercom.android.sdk.ui.common;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.dmk;
import defpackage.m51;
import defpackage.pq4;
import defpackage.sr8;
import defpackage.sv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider;", "", "<init>", "()V", "", "getText", "(Lpq4;I)Ljava/lang/String;", "StringRes", "ActualString", "Lio/intercom/android/sdk/ui/common/StringProvider$ActualString;", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class StringProvider {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider$ActualString;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "string", "", "<init>", "(Ljava/lang/String;)V", "getString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ActualString extends StringProvider {
        public static final int $stable = 0;
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActualString(String str) {
            super(null);
            str.getClass();
            this.string = str;
        }

        public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actualString.string;
            }
            return actualString.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getString() {
            return this.string;
        }

        public final ActualString copy(String string) {
            string.getClass();
            return new ActualString(string);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof ActualString) && Intrinsics.areEqual(this.string, ((ActualString) other).string)) {
                return true;
            }
            return false;
        }

        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        public String toString() {
            return m51.m(new StringBuilder("ActualString(string="), this.string, ')');
        }
    }

    public /* synthetic */ StringProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getText(pq4 pq4Var, int i) {
        String parseString;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.e0(-1160503525);
        if (this instanceof ActualString) {
            parseString = ((ActualString) this).getString();
        } else if (this instanceof StringRes) {
            StringRes stringRes = (StringRes) this;
            parseString = ActualStringOrResKt.parseString((Context) sr8Var.l(AndroidCompositionLocals_androidKt.b), stringRes.getStringRes(), stringRes.getParams());
        } else {
            dmk.a();
            return null;
        }
        sr8Var.s(false);
        return parseString;
    }

    private StringProvider() {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "stringRes", "", "params", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getStringRes", "()I", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class StringRes extends StringProvider {
        public static final int $stable = 8;
        private final List<Pair<String, String>> params;
        private final int stringRes;

        public /* synthetic */ StringRes(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringRes.stringRes;
            }
            if ((i2 & 2) != 0) {
                list = stringRes.params;
            }
            return stringRes.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStringRes() {
            return this.stringRes;
        }

        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        public final StringRes copy(int stringRes, List<Pair<String, String>> params) {
            params.getClass();
            return new StringRes(stringRes, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringRes)) {
                return false;
            }
            StringRes stringRes = (StringRes) other;
            if (this.stringRes == stringRes.stringRes && Intrinsics.areEqual(this.params, stringRes.params)) {
                return true;
            }
            return false;
        }

        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return this.params.hashCode() + (Integer.hashCode(this.stringRes) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StringRes(stringRes=");
            sb.append(this.stringRes);
            sb.append(", params=");
            return sv6.r(sb, this.params, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringRes(int i, List<Pair<String, String>> list) {
            super(null);
            list.getClass();
            this.stringRes = i;
            this.params = list;
        }
    }
}
