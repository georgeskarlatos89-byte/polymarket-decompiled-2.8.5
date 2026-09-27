package com.polymarket.usviewmodels;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "StartedCase", "WatchedCase", "SnapChangedCase", "MuteChangedCase", "StalledCase", "DeniedCase", "FailedCase", "Companion", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$DeniedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$FailedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$MuteChangedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$SnapChangedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$StalledCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$StartedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$WatchedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class USLivestreamAnalyticsEvent implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final USLivestreamAnalyticsEvent stalled = new StalledCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$DeniedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "associated0", "Lcom/polymarket/usviewmodels/USLivestreamDenialReason;", "<init>", "(Lcom/polymarket/usviewmodels/USLivestreamDenialReason;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USLivestreamDenialReason;", "reason", "getReason", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DeniedCase extends USLivestreamAnalyticsEvent {
        private final USLivestreamDenialReason associated0;
        private final USLivestreamDenialReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeniedCase(USLivestreamDenialReason uSLivestreamDenialReason) {
            super(null);
            uSLivestreamDenialReason.getClass();
            this.associated0 = uSLivestreamDenialReason;
            this.reason = uSLivestreamDenialReason;
        }

        public boolean equals(Object other) {
            if (!(other instanceof DeniedCase) || this.associated0 != ((DeniedCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final USLivestreamDenialReason getAssociated0() {
            return this.associated0;
        }

        public final USLivestreamDenialReason getReason() {
            return this.reason;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$FailedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "associated0", "Lcom/polymarket/usviewmodels/USLivestreamFailureStage;", "associated1", "", "associated2", "", "associated3", "<init>", "(Lcom/polymarket/usviewmodels/USLivestreamFailureStage;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USLivestreamFailureStage;", "getAssociated1", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssociated2", "()Ljava/lang/String;", "getAssociated3", "stage", "getStage", "httpStatus", "getHttpStatus", "errorDomain", "getErrorDomain", "errorCode", "getErrorCode", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FailedCase extends USLivestreamAnalyticsEvent {
        private final USLivestreamFailureStage associated0;
        private final Integer associated1;
        private final String associated2;
        private final Integer associated3;
        private final Integer errorCode;
        private final String errorDomain;
        private final Integer httpStatus;
        private final USLivestreamFailureStage stage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedCase(USLivestreamFailureStage uSLivestreamFailureStage, Integer num, String str, Integer num2) {
            super(null);
            uSLivestreamFailureStage.getClass();
            this.associated0 = uSLivestreamFailureStage;
            this.associated1 = num;
            this.associated2 = str;
            this.associated3 = num2;
            this.stage = uSLivestreamFailureStage;
            this.httpStatus = num;
            this.errorDomain = str;
            this.errorCode = num2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof FailedCase)) {
                return false;
            }
            FailedCase failedCase = (FailedCase) other;
            if (this.associated0 != failedCase.associated0 || !Intrinsics.areEqual(this.associated1, failedCase.associated1) || !Intrinsics.areEqual(this.associated2, failedCase.associated2) || !Intrinsics.areEqual(this.associated3, failedCase.associated3)) {
                return false;
            }
            return true;
        }

        public final USLivestreamFailureStage getAssociated0() {
            return this.associated0;
        }

        public final Integer getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final Integer getAssociated3() {
            return this.associated3;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDomain() {
            return this.errorDomain;
        }

        public final Integer getHttpStatus() {
            return this.httpStatus;
        }

        public final USLivestreamFailureStage getStage() {
            return this.stage;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$MuteChangedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "muted", "getMuted", "equals", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MuteChangedCase extends USLivestreamAnalyticsEvent {
        private final boolean associated0;
        private final boolean muted;

        public MuteChangedCase(boolean z) {
            super(null);
            this.associated0 = z;
            this.muted = z;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MuteChangedCase) || this.associated0 != ((MuteChangedCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final boolean getAssociated0() {
            return this.associated0;
        }

        public final boolean getMuted() {
            return this.muted;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$SnapChangedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "associated0", "Lcom/polymarket/usviewmodels/USLivestreamSnapPosition;", "<init>", "(Lcom/polymarket/usviewmodels/USLivestreamSnapPosition;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USLivestreamSnapPosition;", "to", "getTo", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SnapChangedCase extends USLivestreamAnalyticsEvent {
        private final USLivestreamSnapPosition associated0;
        private final USLivestreamSnapPosition to;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SnapChangedCase(USLivestreamSnapPosition uSLivestreamSnapPosition) {
            super(null);
            uSLivestreamSnapPosition.getClass();
            this.associated0 = uSLivestreamSnapPosition;
            this.to = uSLivestreamSnapPosition;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SnapChangedCase) || this.associated0 != ((SnapChangedCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final USLivestreamSnapPosition getAssociated0() {
            return this.associated0;
        }

        public final USLivestreamSnapPosition getTo() {
            return this.to;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$StalledCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class StalledCase extends USLivestreamAnalyticsEvent {
        public StalledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0015\u0010\fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0017\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$StartedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "associated0", "", "associated1", "associated2", "associated3", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAssociated0", "()I", "getAssociated1", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssociated2", "getAssociated3", "timeToStartMs", "getTimeToStartMs", "resolveMs", "getResolveMs", "playerBootMs", "getPlayerBootMs", "firstFrameMs", "getFirstFrameMs", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class StartedCase extends USLivestreamAnalyticsEvent {
        private final int associated0;
        private final Integer associated1;
        private final Integer associated2;
        private final Integer associated3;
        private final Integer firstFrameMs;
        private final Integer playerBootMs;
        private final Integer resolveMs;
        private final int timeToStartMs;

        public StartedCase(int i, Integer num, Integer num2, Integer num3) {
            super(null);
            this.associated0 = i;
            this.associated1 = num;
            this.associated2 = num2;
            this.associated3 = num3;
            this.timeToStartMs = i;
            this.resolveMs = num;
            this.playerBootMs = num2;
            this.firstFrameMs = num3;
        }

        public boolean equals(Object other) {
            if (!(other instanceof StartedCase)) {
                return false;
            }
            StartedCase startedCase = (StartedCase) other;
            if (this.associated0 != startedCase.associated0 || !Intrinsics.areEqual(this.associated1, startedCase.associated1) || !Intrinsics.areEqual(this.associated2, startedCase.associated2) || !Intrinsics.areEqual(this.associated3, startedCase.associated3)) {
                return false;
            }
            return true;
        }

        public final int getAssociated0() {
            return this.associated0;
        }

        public final Integer getAssociated1() {
            return this.associated1;
        }

        public final Integer getAssociated2() {
            return this.associated2;
        }

        public final Integer getAssociated3() {
            return this.associated3;
        }

        public final Integer getFirstFrameMs() {
            return this.firstFrameMs;
        }

        public final Integer getPlayerBootMs() {
            return this.playerBootMs;
        }

        public final Integer getResolveMs() {
            return this.resolveMs;
        }

        public final int getTimeToStartMs() {
            return this.timeToStartMs;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$WatchedCase;", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "associated0", "", "associated1", "Lcom/polymarket/usviewmodels/USLivestreamWatchEndReason;", "associated2", "associated3", "<init>", "(ILcom/polymarket/usviewmodels/USLivestreamWatchEndReason;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAssociated0", "()I", "getAssociated1", "()Lcom/polymarket/usviewmodels/USLivestreamWatchEndReason;", "getAssociated2", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssociated3", "watchedSeconds", "getWatchedSeconds", "endedBy", "getEndedBy", "stallCount", "getStallCount", "stallTotalMs", "getStallTotalMs", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class WatchedCase extends USLivestreamAnalyticsEvent {
        private final int associated0;
        private final USLivestreamWatchEndReason associated1;
        private final Integer associated2;
        private final Integer associated3;
        private final USLivestreamWatchEndReason endedBy;
        private final Integer stallCount;
        private final Integer stallTotalMs;
        private final int watchedSeconds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WatchedCase(int i, USLivestreamWatchEndReason uSLivestreamWatchEndReason, Integer num, Integer num2) {
            super(null);
            uSLivestreamWatchEndReason.getClass();
            this.associated0 = i;
            this.associated1 = uSLivestreamWatchEndReason;
            this.associated2 = num;
            this.associated3 = num2;
            this.watchedSeconds = i;
            this.endedBy = uSLivestreamWatchEndReason;
            this.stallCount = num;
            this.stallTotalMs = num2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof WatchedCase)) {
                return false;
            }
            WatchedCase watchedCase = (WatchedCase) other;
            if (this.associated0 != watchedCase.associated0 || this.associated1 != watchedCase.associated1 || !Intrinsics.areEqual(this.associated2, watchedCase.associated2) || !Intrinsics.areEqual(this.associated3, watchedCase.associated3)) {
                return false;
            }
            return true;
        }

        public final int getAssociated0() {
            return this.associated0;
        }

        public final USLivestreamWatchEndReason getAssociated1() {
            return this.associated1;
        }

        public final Integer getAssociated2() {
            return this.associated2;
        }

        public final Integer getAssociated3() {
            return this.associated3;
        }

        public final USLivestreamWatchEndReason getEndedBy() {
            return this.endedBy;
        }

        public final Integer getStallCount() {
            return this.stallCount;
        }

        public final Integer getStallTotalMs() {
            return this.stallTotalMs;
        }

        public final int getWatchedSeconds() {
            return this.watchedSeconds;
        }
    }

    public /* synthetic */ USLivestreamAnalyticsEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ USLivestreamAnalyticsEvent access$getStalled$cp() {
        return stalled;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ1\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010&R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent$Companion;", "", "<init>", "()V", MetricTracker.Action.STARTED, "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "timeToStartMs", "", "resolveMs", "playerBootMs", "firstFrameMs", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "watched", "watchedSeconds", "endedBy", "Lcom/polymarket/usviewmodels/USLivestreamWatchEndReason;", "stallCount", "stallTotalMs", "(ILcom/polymarket/usviewmodels/USLivestreamWatchEndReason;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "snapChanged", "to", "Lcom/polymarket/usviewmodels/USLivestreamSnapPosition;", "muteChanged", "muted", "", "stalled", "getStalled", "()Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "denied", "reason", "Lcom/polymarket/usviewmodels/USLivestreamDenialReason;", "failed", "stage", "Lcom/polymarket/usviewmodels/USLivestreamFailureStage;", "httpStatus", "errorDomain", "", "errorCode", "(Lcom/polymarket/usviewmodels/USLivestreamFailureStage;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final USLivestreamAnalyticsEvent denied(USLivestreamDenialReason reason) {
            reason.getClass();
            return new DeniedCase(reason);
        }

        public final USLivestreamAnalyticsEvent failed(USLivestreamFailureStage stage, Integer httpStatus, String errorDomain, Integer errorCode) {
            stage.getClass();
            return new FailedCase(stage, httpStatus, errorDomain, errorCode);
        }

        public final USLivestreamAnalyticsEvent getStalled() {
            return USLivestreamAnalyticsEvent.access$getStalled$cp();
        }

        public final USLivestreamAnalyticsEvent muteChanged(boolean muted) {
            return new MuteChangedCase(muted);
        }

        public final USLivestreamAnalyticsEvent snapChanged(USLivestreamSnapPosition to) {
            to.getClass();
            return new SnapChangedCase(to);
        }

        public final USLivestreamAnalyticsEvent started(int timeToStartMs, Integer resolveMs, Integer playerBootMs, Integer firstFrameMs) {
            return new StartedCase(timeToStartMs, resolveMs, playerBootMs, firstFrameMs);
        }

        public final USLivestreamAnalyticsEvent watched(int watchedSeconds, USLivestreamWatchEndReason endedBy, Integer stallCount, Integer stallTotalMs) {
            endedBy.getClass();
            return new WatchedCase(watchedSeconds, endedBy, stallCount, stallTotalMs);
        }

        private Companion() {
        }
    }

    private USLivestreamAnalyticsEvent() {
    }
}
