package io.intercom.android.sdk.ui.common;

import defpackage.gkj;
import defpackage.hkj;
import defpackage.ib4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013JX\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "", "", "navIcon", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subTitle", "Lib4;", "backgroundColor", "contentColor", "subTitleColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lib4;Lib4;Lib4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4-QN2ZGVo", "()Lib4;", "component4", "component5-QN2ZGVo", "component5", "component6-QN2ZGVo", "component6", "copy-K74yeK8", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lib4;Lib4;Lib4;)Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getNavIcon", "Ljava/lang/String;", "getTitle", "getSubTitle", "Lib4;", "getBackgroundColor-QN2ZGVo", "getContentColor-QN2ZGVo", "getSubTitleColor-QN2ZGVo", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IntercomTopBarState {
    public static final int $stable = 0;
    private final ib4 backgroundColor;
    private final ib4 contentColor;
    private final Integer navIcon;
    private final String subTitle;
    private final ib4 subTitleColor;
    private final String title;

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : ib4Var, (i & 16) != 0 ? null : ib4Var2, (i & 32) != 0 ? null : ib4Var3, null);
    }

    /* renamed from: copy-K74yeK8$default, reason: not valid java name */
    public static /* synthetic */ IntercomTopBarState m526copyK74yeK8$default(IntercomTopBarState intercomTopBarState, Integer num, String str, String str2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = intercomTopBarState.navIcon;
        }
        if ((i & 2) != 0) {
            str = intercomTopBarState.title;
        }
        if ((i & 4) != 0) {
            str2 = intercomTopBarState.subTitle;
        }
        if ((i & 8) != 0) {
            ib4Var = intercomTopBarState.backgroundColor;
        }
        if ((i & 16) != 0) {
            ib4Var2 = intercomTopBarState.contentColor;
        }
        if ((i & 32) != 0) {
            ib4Var3 = intercomTopBarState.subTitleColor;
        }
        ib4 ib4Var4 = ib4Var2;
        ib4 ib4Var5 = ib4Var3;
        return intercomTopBarState.m530copyK74yeK8(num, str, str2, ib4Var, ib4Var4, ib4Var5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getContentColor() {
        return this.contentColor;
    }

    /* renamed from: component6-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getSubTitleColor() {
        return this.subTitleColor;
    }

    /* renamed from: copy-K74yeK8, reason: not valid java name */
    public final IntercomTopBarState m530copyK74yeK8(Integer navIcon, String title, String subTitle, ib4 backgroundColor, ib4 contentColor, ib4 subTitleColor) {
        return new IntercomTopBarState(navIcon, title, subTitle, backgroundColor, contentColor, subTitleColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomTopBarState)) {
            return false;
        }
        IntercomTopBarState intercomTopBarState = (IntercomTopBarState) other;
        if (Intrinsics.areEqual(this.navIcon, intercomTopBarState.navIcon) && Intrinsics.areEqual(this.title, intercomTopBarState.title) && Intrinsics.areEqual(this.subTitle, intercomTopBarState.subTitle) && Intrinsics.areEqual(this.backgroundColor, intercomTopBarState.backgroundColor) && Intrinsics.areEqual(this.contentColor, intercomTopBarState.contentColor) && Intrinsics.areEqual(this.subTitleColor, intercomTopBarState.subTitleColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final ib4 m531getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final ib4 m532getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final ib4 m533getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Integer num = this.navIcon;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.title;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.subTitle;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ib4 ib4Var = this.backgroundColor;
        if (ib4Var == null) {
            hashCode4 = 0;
        } else {
            long j = ib4Var.a;
            gkj gkjVar = hkj.b;
            hashCode4 = Long.hashCode(j);
        }
        int i5 = (i4 + hashCode4) * 31;
        ib4 ib4Var2 = this.contentColor;
        if (ib4Var2 == null) {
            hashCode5 = 0;
        } else {
            long j2 = ib4Var2.a;
            gkj gkjVar2 = hkj.b;
            hashCode5 = Long.hashCode(j2);
        }
        int i6 = (i5 + hashCode5) * 31;
        ib4 ib4Var3 = this.subTitleColor;
        if (ib4Var3 != null) {
            long j3 = ib4Var3.a;
            gkj gkjVar3 = hkj.b;
            i = Long.hashCode(j3);
        }
        return i6 + i;
    }

    public String toString() {
        return "IntercomTopBarState(navIcon=" + this.navIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", subTitleColor=" + this.subTitleColor + ')';
    }

    private IntercomTopBarState(Integer num, String str, String str2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3) {
        this.navIcon = num;
        this.title = str;
        this.subTitle = str2;
        this.backgroundColor = ib4Var;
        this.contentColor = ib4Var2;
        this.subTitleColor = ib4Var3;
    }

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, ib4Var, ib4Var2, ib4Var3);
    }
}
