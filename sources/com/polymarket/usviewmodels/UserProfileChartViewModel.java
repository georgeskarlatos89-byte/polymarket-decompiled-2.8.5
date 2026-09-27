package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EAmount;
import com.polymarket.data.EError;
import com.polymarket.data.EPortfolioPnlData;
import com.polymarket.data.ETimeSeriesEntry;
import com.polymarket.data.ETimeSeriesInterval;
import com.polymarket.data.EUser;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.py2;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 h2\u00020\u0001:\u0004fghiB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010\u001a\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001b\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010#\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010+\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020$H\u0082 J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u00104\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082 J\u0015\u0010:\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010;\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020-H\u0082 J\u0015\u0010A\u001a\u00020<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010B\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020<H\u0082 J\u0015\u0010E\u001a\u00020<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010F\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020<H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010N\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010GH\u0082 J\u0015\u0010R\u001a\u00020<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010S\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020<H\u0082 J\b\u0010T\u001a\u00020\u0015H\u0016J\u0015\u0010U\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010V\u001a\u00020\u00152\u0006\u0010W\u001a\u00020XH\u0016J\u001d\u0010Y\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010W\u001a\u00020XH\u0082 J\u0017\u0010\u0016\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0002\u0010\\J$\u0010]\u001a\u0004\u0018\u00010Z2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010^\u001a\u00020ZH\u0082 ¢\u0006\u0002\u0010_J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0016J\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0082 R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020-0,8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00105\u001a\u00020-2\u0006\u0010\f\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u00020<2\u0006\u0010\f\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010C\u001a\u00020<2\u0006\u0010\f\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R(\u0010H\u001a\u0004\u0018\u00010G2\b\u0010\f\u001a\u0004\u0018\u00010G8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010O\u001a\u00020<2\u0006\u0010\f\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010>\"\u0004\bQ\u0010@¨\u0006j"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "user", "Lcom/polymarket/data/EUser;", "(Lcom/polymarket/data/EUser;)V", "newValue", "Lcom/polymarket/data/EAmount;", "portfolioValue", "getPortfolioValue", "()Lcom/polymarket/data/EAmount;", "setPortfolioValue", "(Lcom/polymarket/data/EAmount;)V", "Swift_portfolioValue", "Swift_portfolioValue_set", "", "value", "allTimePnl", "getAllTimePnl", "setAllTimePnl", "Swift_allTimePnl", "Swift_allTimePnl_set", "Lcom/polymarket/data/EPortfolioPnlData;", "dailyPnlData", "getDailyPnlData", "()Lcom/polymarket/data/EPortfolioPnlData;", "setDailyPnlData", "(Lcom/polymarket/data/EPortfolioPnlData;)V", "Swift_dailyPnlData", "Swift_dailyPnlData_set", "Lcom/polymarket/data/ETimeSeriesEntry;", "seriesEntry", "getSeriesEntry", "()Lcom/polymarket/data/ETimeSeriesEntry;", "setSeriesEntry", "(Lcom/polymarket/data/ETimeSeriesEntry;)V", "Swift_seriesEntry", "Swift_seriesEntry_set", "", "Lcom/polymarket/data/ETimeSeriesInterval;", "availableTimeframes", "getAvailableTimeframes", "()Ljava/util/List;", "setAvailableTimeframes", "(Ljava/util/List;)V", "Swift_availableTimeframes", "Swift_availableTimeframes_set", "selectedTimeframe", "getSelectedTimeframe", "()Lcom/polymarket/data/ETimeSeriesInterval;", "setSelectedTimeframe", "(Lcom/polymarket/data/ETimeSeriesInterval;)V", "Swift_selectedTimeframe", "Swift_selectedTimeframe_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isRefreshing", "setRefreshing", "Swift_isRefreshing", "Swift_isRefreshing_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "allowPostLoadAnimation", "getAllowPostLoadAnimation", "setAllowPostLoadAnimation", "Swift_allowPostLoadAnimation", "Swift_allowPostLoadAnimation_set", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "Swift_sendInput_2", "", "at", "(D)Ljava/lang/Double;", "Swift_value_3", "timestamp", "(JD)Ljava/lang/Double;", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Input", "MockTrend", "Companion", "CompanionClass", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class UserProfileChartViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$CompanionClass;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel;", "trend", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$MockTrend;", "portfolioValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class CompanionClass extends AppViewModel.CompanionClass {
        public static /* synthetic */ UserProfileChartViewModel mock$default(CompanionClass companionClass, MockTrend mockTrend, double d, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    mockTrend = MockTrend.up;
                }
                if ((i & 2) != 0) {
                    d = 12500.0d;
                }
                return companionClass.mock(mockTrend, d);
            }
            py2.f("Super calls with default arguments not supported in this target, function: mock");
            return null;
        }

        public UserProfileChartViewModel mock(MockTrend trend, double portfolioValue) {
            trend.getClass();
            return UserProfileChartViewModel.INSTANCE.mock(trend, portfolioValue);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$MockTrend;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "up", "down", "flat", "volatile", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MockTrend implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MockTrend[] $VALUES;
        public static final MockTrend up = new MockTrend("up", 0);
        public static final MockTrend down = new MockTrend("down", 1);
        public static final MockTrend flat = new MockTrend("flat", 2);

        /* renamed from: volatile, reason: not valid java name */
        public static final MockTrend f17volatile = new MockTrend("volatile", 3);

        private static final /* synthetic */ MockTrend[] $values() {
            return new MockTrend[]{up, down, flat, f17volatile};
        }

        static {
            MockTrend[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private MockTrend(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MockTrend valueOf(String str) {
            return (MockTrend) Enum.valueOf(MockTrend.class, str);
        }

        public static MockTrend[] values() {
            return (MockTrend[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileChartViewModel(EUser eUser) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eUser), (SwiftPeerMarker) null);
        eUser.getClass();
    }

    private final native EAmount Swift_allTimePnl(long Swift_peer);

    private final native void Swift_allTimePnl_set(long Swift_peer, EAmount value);

    private final native boolean Swift_allowPostLoadAnimation(long Swift_peer);

    private final native void Swift_allowPostLoadAnimation_set(long Swift_peer, boolean value);

    private final native List<ETimeSeriesInterval> Swift_availableTimeframes(long Swift_peer);

    private final native void Swift_availableTimeframes_set(long Swift_peer, List<? extends ETimeSeriesInterval> value);

    private final native EPortfolioPnlData Swift_dailyPnlData(long Swift_peer);

    private final native void Swift_dailyPnlData_set(long Swift_peer, EPortfolioPnlData value);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native void Swift_isRefreshing_set(long Swift_peer, boolean value);

    private final native EAmount Swift_portfolioValue(long Swift_peer);

    private final native void Swift_portfolioValue_set(long Swift_peer, EAmount value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ETimeSeriesInterval Swift_selectedTimeframe(long Swift_peer);

    private final native void Swift_selectedTimeframe_set(long Swift_peer, ETimeSeriesInterval value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native ETimeSeriesEntry Swift_seriesEntry(long Swift_peer);

    private final native void Swift_seriesEntry_set(long Swift_peer, ETimeSeriesEntry value);

    private final native void Swift_setup_1(long Swift_peer);

    private final native Double Swift_value_3(long Swift_peer, double timestamp);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public EAmount getAllTimePnl() {
        return Swift_allTimePnl(getSwift_peer());
    }

    public boolean getAllowPostLoadAnimation() {
        return Swift_allowPostLoadAnimation(getSwift_peer());
    }

    public List<ETimeSeriesInterval> getAvailableTimeframes() {
        return Swift_availableTimeframes(getSwift_peer());
    }

    public EPortfolioPnlData getDailyPnlData() {
        return Swift_dailyPnlData(getSwift_peer());
    }

    public EError getError() {
        return Swift_error(getSwift_peer());
    }

    public EAmount getPortfolioValue() {
        return Swift_portfolioValue(getSwift_peer());
    }

    public ETimeSeriesInterval getSelectedTimeframe() {
        return Swift_selectedTimeframe(getSwift_peer());
    }

    public ETimeSeriesEntry getSeriesEntry() {
        return Swift_seriesEntry(getSwift_peer());
    }

    public boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    public void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public void setAllTimePnl(EAmount eAmount) {
        eAmount.getClass();
        Swift_allTimePnl_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public void setAllowPostLoadAnimation(boolean z) {
        Swift_allowPostLoadAnimation_set(getSwift_peer(), z);
    }

    public void setAvailableTimeframes(List<? extends ETimeSeriesInterval> list) {
        list.getClass();
        Swift_availableTimeframes_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public void setDailyPnlData(EPortfolioPnlData ePortfolioPnlData) {
        Swift_dailyPnlData_set(getSwift_peer(), ePortfolioPnlData);
    }

    public void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public void setPortfolioValue(EAmount eAmount) {
        eAmount.getClass();
        Swift_portfolioValue_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public void setRefreshing(boolean z) {
        Swift_isRefreshing_set(getSwift_peer(), z);
    }

    public void setSelectedTimeframe(ETimeSeriesInterval eTimeSeriesInterval) {
        eTimeSeriesInterval.getClass();
        Swift_selectedTimeframe_set(getSwift_peer(), eTimeSeriesInterval);
    }

    public void setSeriesEntry(ETimeSeriesEntry eTimeSeriesEntry) {
        eTimeSeriesEntry.getClass();
        Swift_seriesEntry_set(getSwift_peer(), (ETimeSeriesEntry) StructKt.sref$default(eTimeSeriesEntry, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    public Double value(double at) {
        return Swift_value_3(getSwift_peer(), at);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnRefreshCase", "OnTimeframeChangedCase", "Companion", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$OnTimeframeChangedCase;", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onRefresh = new OnRefreshCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$OnTimeframeChangedCase;", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "associated0", "Lcom/polymarket/data/ETimeSeriesInterval;", "<init>", "(Lcom/polymarket/data/ETimeSeriesInterval;)V", "getAssociated0", "()Lcom/polymarket/data/ETimeSeriesInterval;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTimeframeChangedCase extends Input {
            private final ETimeSeriesInterval associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTimeframeChangedCase(ETimeSeriesInterval eTimeSeriesInterval) {
                super(null);
                eTimeSeriesInterval.getClass();
                this.associated0 = eTimeSeriesInterval;
            }

            public final ETimeSeriesInterval getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Input;", "onRefresh", "getOnRefresh", "onTimeframeChanged", "associated0", "Lcom/polymarket/data/ETimeSeriesInterval;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onTimeframeChanged(ETimeSeriesInterval associated0) {
                associated0.getClass();
                return new OnTimeframeChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0019\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/UserProfileChartViewModel$Companion;", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "user", "Lcom/polymarket/data/EUser;", "mock", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel;", "trend", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel$MockTrend;", "portfolioValue", "", "Swift_Companion_mock_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EUser user);

        private final native UserProfileChartViewModel Swift_Companion_mock_4(MockTrend trend, double portfolioValue);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EUser eUser) {
            return companion.Swift_Companion_constructor_0(eUser);
        }

        @Override // com.polymarket.usviewmodels.UserProfileChartViewModel.CompanionClass
        public UserProfileChartViewModel mock(MockTrend trend, double portfolioValue) {
            trend.getClass();
            return Swift_Companion_mock_4(trend, portfolioValue);
        }

        private Companion() {
        }
    }

    public UserProfileChartViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
