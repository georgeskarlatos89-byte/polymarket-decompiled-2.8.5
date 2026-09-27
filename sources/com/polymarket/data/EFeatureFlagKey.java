package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0003\b\u0084\u0001\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u009c\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0002\u009c\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0090\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0003H\u0082 J\u0014\u0010\u0096\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0003H\u0082 J\u001b\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\b\u0010\u009a\u0001\u001a\u00030\u0093\u0001H\u0016J\u001c\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\b\u0010\u009a\u0001\u001a\u00030\u0093\u0001H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u008c\u0001\u001a\u00030\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0015\u0010\u0092\u0001\u001a\u00030\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/polymarket/data/EFeatureFlagKey;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "applePay", "applePayWithdrawal", "googlePay", "appleCashWithdrawal", "sportsPills", "playByPlay", "emojiBattle", "systemStatusBanners", "depositOutage", "withdrawalOutage", "teamBlobGradient", "tradingOutage", "gateTTLOverrides", "resolvedPositionsBanner", "cancelWithdrawal", "criticalMaintenance", "exploreSpecialEventBanner", "calendarPnl", "nflHubEnabled", "nflHubPlayoffsTabEnabled", "midtermsHubEnabled", "nflLiveMarkets", "footballSplashEnabled", "intercomSupport", "chatEnabled", "squadsImageUploads", "squadsPhotoPositions", "eventChatImageSharing", "chatExcludedTags", "chatPositionFlairSteps", "chatPlayByPlaySenderUsername", "chatSquadStatusSenderUsername", "chatPolymarketUserId", "chatMentionsEnabled", "chatSquadInvitesEnabled", "marketMentionsEnabled", "maxImageReactions", "maxPositionShares", "selfieShareCaptionText", "promoBannerTemplates", "showPromoCodeSettingsEntry", "liquidityRewardTags", "liveTradeEnabled", "liveTradeLeagueTags", "liveTradeExcludedEventSlugs", "gameSwitcherLeagueSlugs", "liveTradePriceImpactWarningThresholdPercent", "tradeWidgetSlippageWarningThresholdPercent", "livestreamAutoPiPEnabled", "combosEnabled", "combosHomeBuildComboButtonEnabled", "premadeCombosRail", "tradeSheetComboEntry", "pickemPopularProps", "pickemTagPropPills", "pregameStatsSheet", "removeStoredPaymentMethod", "paymentMethodBillingAddressPrefill", "minimumDepositAmountUsd", "minimumEventVolumeUsd", "depositLimits", "whaleDepositGate", "rfiWebViewUrl", "smsReverifyEnabled", "onboardingWebViewUrl", "tycWebViewUrl", "bugReportShake", "stripePayments", "paypal", "venmo", "stripeLink", "stripeCardNameFromKyc", "creditCards", "depositContext", "autoRailDeposits", "kycStatusDocvSignal", "androidDocvStableActivity", "smsMfaEnabled", "auth0HTTPSCallbackEnabled", "mintPasskeyInSettings", "mfaChallengePreKyc", "kycPrefillOtpBridge", "deduplicateSigninByPhone", "refreshUserOnWebOnboardingComplete", "webOnboarding", "onboardingRouteByKYCState", "singleTunnelOnboarding", "ep3ClaimsAcquisition", "exchangeAccountReadGate", "excludedMarketingAttributeTags", "registration", "networkHealthMonitor", "promotionCompetitionsEnabled", "userReferralsEnabled", "referralCardBackgroundImageURL", "chatRepliesEnabled", "showChatPriceFlurries", "connectGatewayEnabled", "gatewayRouteMap", "realtimeStreamFeeds", "p2ExchangeHeader", "activityHistoryRetentionPeriod", "marketPriceThrottleEnabled", "squadsRealtimePositionCards", "squadsRealtimePositionCardPrices", "squadsOutage", "squadsTutorial", "squadsRealtimeRefreshJitter", "eventActivityEnabled", "promotionalSMSConsent", "geoBlockedConfig", "geoShadowMode", "webLinks", "marketResolutionUX", "marketResolutionUXCombos", "spreadRulesClientFlip", "marketingCampaigns", "americanOddsEnabled", "loggedOutSupportGate", "bonusBalanceBreakdown", "inAppToastsEnabled", "limitOrderSideToggle", "teamChatOutage", "livePerfOptimizations", "incrementalMarketSubscriptions", "tabScopedMarketSubscriptions", "selfMatchRecovery", "defaultBool", "", "getDefaultBool", "()Z", "Swift_defaultBool", Keys.KEY_NAME, "defaultInt", "", "getDefaultInt", "()I", "Swift_defaultInt", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EFeatureFlagKey implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EFeatureFlagKey[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EFeatureFlagKey applePay = new EFeatureFlagKey("applePay", 0, "killswitch_apple_pay", null, 2, null);
    public static final EFeatureFlagKey applePayWithdrawal = new EFeatureFlagKey("applePayWithdrawal", 1, "killswitch_apple_pay_withdrawal", null, 2, null);
    public static final EFeatureFlagKey googlePay = new EFeatureFlagKey("googlePay", 2, "killswitch_google_pay", null, 2, null);
    public static final EFeatureFlagKey appleCashWithdrawal = new EFeatureFlagKey("appleCashWithdrawal", 3, "killswitch_apple_cash_withdrawal", null, 2, null);
    public static final EFeatureFlagKey sportsPills = new EFeatureFlagKey("sportsPills", 4, "rollout_sports_pills", null, 2, null);
    public static final EFeatureFlagKey playByPlay = new EFeatureFlagKey("playByPlay", 5, "rollout_play_by_play", null, 2, null);
    public static final EFeatureFlagKey emojiBattle = new EFeatureFlagKey("emojiBattle", 6, "rollout_emoji_battle", null, 2, null);
    public static final EFeatureFlagKey systemStatusBanners = new EFeatureFlagKey("systemStatusBanners", 7, "configuration_system_status_banners", null, 2, null);
    public static final EFeatureFlagKey depositOutage = new EFeatureFlagKey("depositOutage", 8, "killswitch_deposit_outage", null, 2, null);
    public static final EFeatureFlagKey withdrawalOutage = new EFeatureFlagKey("withdrawalOutage", 9, "killswitch_withdrawal_outage", null, 2, null);
    public static final EFeatureFlagKey teamBlobGradient = new EFeatureFlagKey("teamBlobGradient", 10, "rollout_team_blob_gradient", null, 2, null);
    public static final EFeatureFlagKey tradingOutage = new EFeatureFlagKey("tradingOutage", 11, "killswitch_trading_outage", null, 2, null);
    public static final EFeatureFlagKey gateTTLOverrides = new EFeatureFlagKey("gateTTLOverrides", 12, "configuration_gate_ttl_overrides", null, 2, null);
    public static final EFeatureFlagKey resolvedPositionsBanner = new EFeatureFlagKey("resolvedPositionsBanner", 13, "rollout_resolved_positions_banner", null, 2, null);
    public static final EFeatureFlagKey cancelWithdrawal = new EFeatureFlagKey("cancelWithdrawal", 14, "rollout_cancel_withdrawal", null, 2, null);
    public static final EFeatureFlagKey criticalMaintenance = new EFeatureFlagKey("criticalMaintenance", 15, "killswitch_critical_maintenance", null, 2, null);
    public static final EFeatureFlagKey exploreSpecialEventBanner = new EFeatureFlagKey("exploreSpecialEventBanner", 16, "killswitch_explore_special_event_banner", null, 2, null);
    public static final EFeatureFlagKey calendarPnl = new EFeatureFlagKey("calendarPnl", 17, "rollout_calendar_pnl", null, 2, null);
    public static final EFeatureFlagKey nflHubEnabled = new EFeatureFlagKey("nflHubEnabled", 18, "rollout_nfl_hub", null, 2, null);
    public static final EFeatureFlagKey nflHubPlayoffsTabEnabled = new EFeatureFlagKey("nflHubPlayoffsTabEnabled", 19, "rollout_nfl_hub_playoffs_tab", null, 2, null);
    public static final EFeatureFlagKey midtermsHubEnabled = new EFeatureFlagKey("midtermsHubEnabled", 20, "rollout_midterms_hub", null, 2, null);
    public static final EFeatureFlagKey nflLiveMarkets = new EFeatureFlagKey("nflLiveMarkets", 21, "rollout_nfl_live_markets", null, 2, null);
    public static final EFeatureFlagKey footballSplashEnabled = new EFeatureFlagKey("footballSplashEnabled", 22, "rollout_football_splash", null, 2, null);
    public static final EFeatureFlagKey intercomSupport = new EFeatureFlagKey("intercomSupport", 23, "killswitch_intercom_support", null, 2, null);
    public static final EFeatureFlagKey chatEnabled = new EFeatureFlagKey("chatEnabled", 24, "killswitch_chat", null, 2, null);
    public static final EFeatureFlagKey squadsImageUploads = new EFeatureFlagKey("squadsImageUploads", 25, "killswitch_squads_image_uploads", null, 2, null);
    public static final EFeatureFlagKey squadsPhotoPositions = new EFeatureFlagKey("squadsPhotoPositions", 26, "rollout_squads_photo_positions", null, 2, null);
    public static final EFeatureFlagKey eventChatImageSharing = new EFeatureFlagKey("eventChatImageSharing", 27, "rollout_event_chat_image_sharing", null, 2, null);
    public static final EFeatureFlagKey chatExcludedTags = new EFeatureFlagKey("chatExcludedTags", 28, "configuration_chat_excluded_tags", null, 2, null);
    public static final EFeatureFlagKey chatPositionFlairSteps = new EFeatureFlagKey("chatPositionFlairSteps", 29, "configuration_chat_position_flair_steps", null, 2, null);
    public static final EFeatureFlagKey chatPlayByPlaySenderUsername = new EFeatureFlagKey("chatPlayByPlaySenderUsername", 30, "configuration_chat_play_by_play_sender_username", null, 2, null);
    public static final EFeatureFlagKey chatSquadStatusSenderUsername = new EFeatureFlagKey("chatSquadStatusSenderUsername", 31, "configuration_chat_squad_status_sender_username", null, 2, null);
    public static final EFeatureFlagKey chatPolymarketUserId = new EFeatureFlagKey("chatPolymarketUserId", 32, "configuration_chat_polymarket_user_id", null, 2, null);
    public static final EFeatureFlagKey chatMentionsEnabled = new EFeatureFlagKey("chatMentionsEnabled", 33, "rollout_chat_mentions", null, 2, null);
    public static final EFeatureFlagKey chatSquadInvitesEnabled = new EFeatureFlagKey("chatSquadInvitesEnabled", 34, "rollout_chat_squad_invites", null, 2, null);
    public static final EFeatureFlagKey marketMentionsEnabled = new EFeatureFlagKey("marketMentionsEnabled", 35, "rollout_market_mentions", null, 2, null);
    public static final EFeatureFlagKey maxImageReactions = new EFeatureFlagKey("maxImageReactions", 36, "configuration_chat_max_image_reactions", null, 2, null);
    public static final EFeatureFlagKey maxPositionShares = new EFeatureFlagKey("maxPositionShares", 37, "configuration_chat_max_position_shares", null, 2, null);
    public static final EFeatureFlagKey selfieShareCaptionText = new EFeatureFlagKey("selfieShareCaptionText", 38, "configuration_selfie_share_caption_text", null, 2, null);
    public static final EFeatureFlagKey promoBannerTemplates = new EFeatureFlagKey("promoBannerTemplates", 39, "configuration_promo_banner_templates", null, 2, null);
    public static final EFeatureFlagKey showPromoCodeSettingsEntry = new EFeatureFlagKey("showPromoCodeSettingsEntry", 40, "rollout_promo_code_settings_entry", null, 2, null);
    public static final EFeatureFlagKey liquidityRewardTags = new EFeatureFlagKey("liquidityRewardTags", 41, "configuration_liquidity_reward_tags", null, 2, null);
    public static final EFeatureFlagKey liveTradeEnabled = new EFeatureFlagKey("liveTradeEnabled", 42, "rollout_live_trade", null, 2, null);
    public static final EFeatureFlagKey liveTradeLeagueTags = new EFeatureFlagKey("liveTradeLeagueTags", 43, "configuration_live_trade_league_tags", null, 2, null);
    public static final EFeatureFlagKey liveTradeExcludedEventSlugs = new EFeatureFlagKey("liveTradeExcludedEventSlugs", 44, "configuration_live_trade_excluded_event_slugs", null, 2, null);
    public static final EFeatureFlagKey gameSwitcherLeagueSlugs = new EFeatureFlagKey("gameSwitcherLeagueSlugs", 45, "configuration_game_switcher_league_slugs", null, 2, null);
    public static final EFeatureFlagKey liveTradePriceImpactWarningThresholdPercent = new EFeatureFlagKey("liveTradePriceImpactWarningThresholdPercent", 46, "configuration_live_trade_price_impact_warning_threshold_percent", null, 2, null);
    public static final EFeatureFlagKey tradeWidgetSlippageWarningThresholdPercent = new EFeatureFlagKey("tradeWidgetSlippageWarningThresholdPercent", 47, "configuration_trade_widget_slippage_warning_threshold_percent", null, 2, null);
    public static final EFeatureFlagKey livestreamAutoPiPEnabled = new EFeatureFlagKey("livestreamAutoPiPEnabled", 48, "rollout_livestream_auto_pip", null, 2, null);
    public static final EFeatureFlagKey combosEnabled = new EFeatureFlagKey("combosEnabled", 49, "rollout_combos", null, 2, null);
    public static final EFeatureFlagKey combosHomeBuildComboButtonEnabled = new EFeatureFlagKey("combosHomeBuildComboButtonEnabled", 50, "rollout_combos_build_combo_button", null, 2, null);
    public static final EFeatureFlagKey premadeCombosRail = new EFeatureFlagKey("premadeCombosRail", 51, "rollout_premade_combos_rail", null, 2, null);
    public static final EFeatureFlagKey tradeSheetComboEntry = new EFeatureFlagKey("tradeSheetComboEntry", 52, "rollout_trade_sheet_combo_entry", null, 2, null);
    public static final EFeatureFlagKey pickemPopularProps = new EFeatureFlagKey("pickemPopularProps", 53, "rollout_pickem_popular_props", null, 2, null);
    public static final EFeatureFlagKey pickemTagPropPills = new EFeatureFlagKey("pickemTagPropPills", 54, "rollout_pickem_tag_prop_pills", null, 2, null);
    public static final EFeatureFlagKey pregameStatsSheet = new EFeatureFlagKey("pregameStatsSheet", 55, "rollout_pregame_stats_sheet", null, 2, null);
    public static final EFeatureFlagKey removeStoredPaymentMethod = new EFeatureFlagKey("removeStoredPaymentMethod", 56, "rollout_remove_stored_payment_method", null, 2, null);
    public static final EFeatureFlagKey paymentMethodBillingAddressPrefill = new EFeatureFlagKey("paymentMethodBillingAddressPrefill", 57, "killswitch_payment_method_billing_address_prefill", null, 2, null);
    public static final EFeatureFlagKey minimumDepositAmountUsd = new EFeatureFlagKey("minimumDepositAmountUsd", 58, "configuration_minimum_deposit_amount_usd", null, 2, null);
    public static final EFeatureFlagKey minimumEventVolumeUsd = new EFeatureFlagKey("minimumEventVolumeUsd", 59, "configuration_minimum_event_volume_usd", null, 2, null);
    public static final EFeatureFlagKey depositLimits = new EFeatureFlagKey("depositLimits", 60, "rollout_deposit_limits", null, 2, null);
    public static final EFeatureFlagKey whaleDepositGate = new EFeatureFlagKey("whaleDepositGate", 61, "configuration_whale_deposit_gate", null, 2, null);
    public static final EFeatureFlagKey rfiWebViewUrl = new EFeatureFlagKey("rfiWebViewUrl", 62, "configuration_rfi_web_view_url", null, 2, null);
    public static final EFeatureFlagKey smsReverifyEnabled = new EFeatureFlagKey("smsReverifyEnabled", 63, "rollout_sms_reverify", null, 2, null);
    public static final EFeatureFlagKey onboardingWebViewUrl = new EFeatureFlagKey("onboardingWebViewUrl", 64, "configuration_onboarding_webview_url", null, 2, null);
    public static final EFeatureFlagKey tycWebViewUrl = new EFeatureFlagKey("tycWebViewUrl", 65, "configuration_tyc_web_view_url", null, 2, null);
    public static final EFeatureFlagKey bugReportShake = new EFeatureFlagKey("bugReportShake", 66, "killswitch_bug_report_shake", null, 2, null);
    public static final EFeatureFlagKey stripePayments = new EFeatureFlagKey("stripePayments", 67, "rollout_stripe_payments", null, 2, null);
    public static final EFeatureFlagKey paypal = new EFeatureFlagKey("paypal", 68, "rollout_paypal", null, 2, null);
    public static final EFeatureFlagKey venmo = new EFeatureFlagKey("venmo", 69, "rollout_venmo", null, 2, null);
    public static final EFeatureFlagKey stripeLink = new EFeatureFlagKey("stripeLink", 70, "rollout_stripe_link", null, 2, null);
    public static final EFeatureFlagKey stripeCardNameFromKyc = new EFeatureFlagKey("stripeCardNameFromKyc", 71, "rollout_stripe_card_name_from_kyc", null, 2, null);
    public static final EFeatureFlagKey creditCards = new EFeatureFlagKey("creditCards", 72, "rollout_credit_cards", null, 2, null);
    public static final EFeatureFlagKey depositContext = new EFeatureFlagKey("depositContext", 73, "rollout_deposit_context", null, 2, null);
    public static final EFeatureFlagKey autoRailDeposits = new EFeatureFlagKey("autoRailDeposits", 74, "rollout_auto_rail_deposits", null, 2, null);
    public static final EFeatureFlagKey kycStatusDocvSignal = new EFeatureFlagKey("kycStatusDocvSignal", 75, "killswitch_kyc_status_docv_signal", null, 2, null);
    public static final EFeatureFlagKey androidDocvStableActivity = new EFeatureFlagKey("androidDocvStableActivity", 76, "rollout_android_docv_stable_activity", null, 2, null);
    public static final EFeatureFlagKey smsMfaEnabled = new EFeatureFlagKey("smsMfaEnabled", 77, "killswitch_sms_mfa", null, 2, null);
    public static final EFeatureFlagKey auth0HTTPSCallbackEnabled = new EFeatureFlagKey("auth0HTTPSCallbackEnabled", 78, "rollout_auth0_https_callback", null, 2, null);
    public static final EFeatureFlagKey mintPasskeyInSettings = new EFeatureFlagKey("mintPasskeyInSettings", 79, "killswitch_mint_passkey_in_settings", null, 2, null);
    public static final EFeatureFlagKey mfaChallengePreKyc = new EFeatureFlagKey("mfaChallengePreKyc", 80, "rollout_mfa_challenge_pre_kyc", null, 2, null);
    public static final EFeatureFlagKey kycPrefillOtpBridge = new EFeatureFlagKey("kycPrefillOtpBridge", 81, "rollout_kyc_prefill_otp_bridge", null, 2, null);
    public static final EFeatureFlagKey deduplicateSigninByPhone = new EFeatureFlagKey("deduplicateSigninByPhone", 82, "rollout_deduplicate_signin_by_phone", null, 2, null);
    public static final EFeatureFlagKey refreshUserOnWebOnboardingComplete = new EFeatureFlagKey("refreshUserOnWebOnboardingComplete", 83, "rollout_refresh_user_web_onboarding_complete", null, 2, null);
    public static final EFeatureFlagKey webOnboarding = new EFeatureFlagKey("webOnboarding", 84, "rollout_web_onboarding", null, 2, null);
    public static final EFeatureFlagKey onboardingRouteByKYCState = new EFeatureFlagKey("onboardingRouteByKYCState", 85, "rollout_onboarding_route_by_kyc_state", null, 2, null);
    public static final EFeatureFlagKey singleTunnelOnboarding = new EFeatureFlagKey("singleTunnelOnboarding", 86, "rollout_single_tunnel_onboarding", null, 2, null);
    public static final EFeatureFlagKey ep3ClaimsAcquisition = new EFeatureFlagKey("ep3ClaimsAcquisition", 87, "rollout_ep3_claims_acquisition", null, 2, null);
    public static final EFeatureFlagKey exchangeAccountReadGate = new EFeatureFlagKey("exchangeAccountReadGate", 88, "rollout_exchange_account_read_gate", null, 2, null);
    public static final EFeatureFlagKey excludedMarketingAttributeTags = new EFeatureFlagKey("excludedMarketingAttributeTags", 89, "configuration_excluded_marketing_attribute_tags", null, 2, null);
    public static final EFeatureFlagKey registration = new EFeatureFlagKey("registration", 90, "killswitch_registration", null, 2, null);
    public static final EFeatureFlagKey networkHealthMonitor = new EFeatureFlagKey("networkHealthMonitor", 91, "killswitch_network_health_monitor", null, 2, null);
    public static final EFeatureFlagKey promotionCompetitionsEnabled = new EFeatureFlagKey("promotionCompetitionsEnabled", 92, "rollout_promotion_competitions", null, 2, null);
    public static final EFeatureFlagKey userReferralsEnabled = new EFeatureFlagKey("userReferralsEnabled", 93, "rollout_user_referrals", null, 2, null);
    public static final EFeatureFlagKey referralCardBackgroundImageURL = new EFeatureFlagKey("referralCardBackgroundImageURL", 94, "configuration_referral_card_background_image_url", null, 2, null);
    public static final EFeatureFlagKey chatRepliesEnabled = new EFeatureFlagKey("chatRepliesEnabled", 95, "rollout_chat_replies", null, 2, null);
    public static final EFeatureFlagKey showChatPriceFlurries = new EFeatureFlagKey("showChatPriceFlurries", 96, "rollout_chat_price_flurries", null, 2, null);
    public static final EFeatureFlagKey connectGatewayEnabled = new EFeatureFlagKey("connectGatewayEnabled", 97, "killswitch_connect_gateway", null, 2, null);
    public static final EFeatureFlagKey gatewayRouteMap = new EFeatureFlagKey("gatewayRouteMap", 98, "configuration_gateway_route_map", null, 2, null);
    public static final EFeatureFlagKey realtimeStreamFeeds = new EFeatureFlagKey("realtimeStreamFeeds", 99, "rollout_realtime_stream_feeds", null, 2, null);
    public static final EFeatureFlagKey p2ExchangeHeader = new EFeatureFlagKey("p2ExchangeHeader", 100, "rollout_p2_exchange_header", null, 2, null);
    public static final EFeatureFlagKey activityHistoryRetentionPeriod = new EFeatureFlagKey("activityHistoryRetentionPeriod", 101, "configuration_activity_history_retention_period", null, 2, null);
    public static final EFeatureFlagKey marketPriceThrottleEnabled = new EFeatureFlagKey("marketPriceThrottleEnabled", 102, "killswitch_market_price_throttle", null, 2, null);
    public static final EFeatureFlagKey squadsRealtimePositionCards = new EFeatureFlagKey("squadsRealtimePositionCards", HttpStatusCodesKt.HTTP_EARLY_HINTS, "rollout_squads_realtime_position_cards", null, 2, null);
    public static final EFeatureFlagKey squadsRealtimePositionCardPrices = new EFeatureFlagKey("squadsRealtimePositionCardPrices", 104, "rollout_squads_realtime_position_card_prices", null, 2, null);
    public static final EFeatureFlagKey squadsOutage = new EFeatureFlagKey("squadsOutage", 105, "killswitch_squads", null, 2, null);
    public static final EFeatureFlagKey squadsTutorial = new EFeatureFlagKey("squadsTutorial", 106, "configuration_squads_tutorial", null, 2, null);
    public static final EFeatureFlagKey squadsRealtimeRefreshJitter = new EFeatureFlagKey("squadsRealtimeRefreshJitter", 107, "configuration_squads_realtime_refresh_jitter", null, 2, null);
    public static final EFeatureFlagKey eventActivityEnabled = new EFeatureFlagKey("eventActivityEnabled", 108, "rollout_event_activity", null, 2, null);
    public static final EFeatureFlagKey promotionalSMSConsent = new EFeatureFlagKey("promotionalSMSConsent", 109, "killswitch_promotional_sms_consent", null, 2, null);
    public static final EFeatureFlagKey geoBlockedConfig = new EFeatureFlagKey("geoBlockedConfig", 110, "configuration_geo_blocked", null, 2, null);
    public static final EFeatureFlagKey geoShadowMode = new EFeatureFlagKey("geoShadowMode", 111, "killswitch_geo_shadow_mode", null, 2, null);
    public static final EFeatureFlagKey webLinks = new EFeatureFlagKey("webLinks", 112, "configuration_web_links", null, 2, null);
    public static final EFeatureFlagKey marketResolutionUX = new EFeatureFlagKey("marketResolutionUX", 113, "rollout_market_resolution_ux", null, 2, null);
    public static final EFeatureFlagKey marketResolutionUXCombos = new EFeatureFlagKey("marketResolutionUXCombos", 114, "rollout_market_resolution_ux_combos", null, 2, null);
    public static final EFeatureFlagKey spreadRulesClientFlip = new EFeatureFlagKey("spreadRulesClientFlip", 115, "rollout_spread_rules_client_flip", null, 2, null);
    public static final EFeatureFlagKey marketingCampaigns = new EFeatureFlagKey("marketingCampaigns", 116, "configuration_marketing_campaigns", null, 2, null);
    public static final EFeatureFlagKey americanOddsEnabled = new EFeatureFlagKey("americanOddsEnabled", 117, "configuration_american_odds", null, 2, null);
    public static final EFeatureFlagKey loggedOutSupportGate = new EFeatureFlagKey("loggedOutSupportGate", 118, "killswitch_logged_out_support_gate", null, 2, null);
    public static final EFeatureFlagKey bonusBalanceBreakdown = new EFeatureFlagKey("bonusBalanceBreakdown", 119, "rollout_bonus_balance_breakdown", null, 2, null);
    public static final EFeatureFlagKey inAppToastsEnabled = new EFeatureFlagKey("inAppToastsEnabled", 120, "killswitch_in_app_toasts", null, 2, null);
    public static final EFeatureFlagKey limitOrderSideToggle = new EFeatureFlagKey("limitOrderSideToggle", 121, "rollout_limit_order_side_toggle", null, 2, null);
    public static final EFeatureFlagKey teamChatOutage = new EFeatureFlagKey("teamChatOutage", 122, "killswitch_team_chat", null, 2, null);
    public static final EFeatureFlagKey livePerfOptimizations = new EFeatureFlagKey("livePerfOptimizations", 123, "killswitch_live_perf_optimizations", null, 2, null);
    public static final EFeatureFlagKey incrementalMarketSubscriptions = new EFeatureFlagKey("incrementalMarketSubscriptions", 124, "killswitch_incremental_market_subscriptions", null, 2, null);
    public static final EFeatureFlagKey tabScopedMarketSubscriptions = new EFeatureFlagKey("tabScopedMarketSubscriptions", 125, "killswitch_tab_scoped_market_subscriptions", null, 2, null);
    public static final EFeatureFlagKey selfMatchRecovery = new EFeatureFlagKey("selfMatchRecovery", WebSocketProtocol.PAYLOAD_SHORT, "rollout_trading_self_match_recovery", null, 2, null);

    private static final /* synthetic */ EFeatureFlagKey[] $values() {
        return new EFeatureFlagKey[]{applePay, applePayWithdrawal, googlePay, appleCashWithdrawal, sportsPills, playByPlay, emojiBattle, systemStatusBanners, depositOutage, withdrawalOutage, teamBlobGradient, tradingOutage, gateTTLOverrides, resolvedPositionsBanner, cancelWithdrawal, criticalMaintenance, exploreSpecialEventBanner, calendarPnl, nflHubEnabled, nflHubPlayoffsTabEnabled, midtermsHubEnabled, nflLiveMarkets, footballSplashEnabled, intercomSupport, chatEnabled, squadsImageUploads, squadsPhotoPositions, eventChatImageSharing, chatExcludedTags, chatPositionFlairSteps, chatPlayByPlaySenderUsername, chatSquadStatusSenderUsername, chatPolymarketUserId, chatMentionsEnabled, chatSquadInvitesEnabled, marketMentionsEnabled, maxImageReactions, maxPositionShares, selfieShareCaptionText, promoBannerTemplates, showPromoCodeSettingsEntry, liquidityRewardTags, liveTradeEnabled, liveTradeLeagueTags, liveTradeExcludedEventSlugs, gameSwitcherLeagueSlugs, liveTradePriceImpactWarningThresholdPercent, tradeWidgetSlippageWarningThresholdPercent, livestreamAutoPiPEnabled, combosEnabled, combosHomeBuildComboButtonEnabled, premadeCombosRail, tradeSheetComboEntry, pickemPopularProps, pickemTagPropPills, pregameStatsSheet, removeStoredPaymentMethod, paymentMethodBillingAddressPrefill, minimumDepositAmountUsd, minimumEventVolumeUsd, depositLimits, whaleDepositGate, rfiWebViewUrl, smsReverifyEnabled, onboardingWebViewUrl, tycWebViewUrl, bugReportShake, stripePayments, paypal, venmo, stripeLink, stripeCardNameFromKyc, creditCards, depositContext, autoRailDeposits, kycStatusDocvSignal, androidDocvStableActivity, smsMfaEnabled, auth0HTTPSCallbackEnabled, mintPasskeyInSettings, mfaChallengePreKyc, kycPrefillOtpBridge, deduplicateSigninByPhone, refreshUserOnWebOnboardingComplete, webOnboarding, onboardingRouteByKYCState, singleTunnelOnboarding, ep3ClaimsAcquisition, exchangeAccountReadGate, excludedMarketingAttributeTags, registration, networkHealthMonitor, promotionCompetitionsEnabled, userReferralsEnabled, referralCardBackgroundImageURL, chatRepliesEnabled, showChatPriceFlurries, connectGatewayEnabled, gatewayRouteMap, realtimeStreamFeeds, p2ExchangeHeader, activityHistoryRetentionPeriod, marketPriceThrottleEnabled, squadsRealtimePositionCards, squadsRealtimePositionCardPrices, squadsOutage, squadsTutorial, squadsRealtimeRefreshJitter, eventActivityEnabled, promotionalSMSConsent, geoBlockedConfig, geoShadowMode, webLinks, marketResolutionUX, marketResolutionUXCombos, spreadRulesClientFlip, marketingCampaigns, americanOddsEnabled, loggedOutSupportGate, bonusBalanceBreakdown, inAppToastsEnabled, limitOrderSideToggle, teamChatOutage, livePerfOptimizations, incrementalMarketSubscriptions, tabScopedMarketSubscriptions, selfMatchRecovery};
    }

    static {
        EFeatureFlagKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EFeatureFlagKey(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native boolean Swift_defaultBool(String name);

    private final native int Swift_defaultInt(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EFeatureFlagKey valueOf(String str) {
        return (EFeatureFlagKey) Enum.valueOf(EFeatureFlagKey.class, str);
    }

    public static EFeatureFlagKey[] values() {
        return (EFeatureFlagKey[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getDefaultBool() {
        return Swift_defaultBool(name());
    }

    public final int getDefaultInt() {
        return Swift_defaultInt(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0082 J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/EFeatureFlagKey$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/EFeatureFlagKey;", "<init>", "()V", "liveUpdating", "", "getLiveUpdating", "()Ljava/util/Set;", "Swift_Companion_liveUpdating", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<EFeatureFlagKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Set<EFeatureFlagKey> Swift_Companion_liveUpdating();

        @Override // skip.lib.CaseIterableCompanion
        public Array<EFeatureFlagKey> getAllCases() {
            return ArrayKt.arrayOf(EFeatureFlagKey.applePay, EFeatureFlagKey.applePayWithdrawal, EFeatureFlagKey.googlePay, EFeatureFlagKey.appleCashWithdrawal, EFeatureFlagKey.sportsPills, EFeatureFlagKey.playByPlay, EFeatureFlagKey.emojiBattle, EFeatureFlagKey.systemStatusBanners, EFeatureFlagKey.depositOutage, EFeatureFlagKey.withdrawalOutage, EFeatureFlagKey.teamBlobGradient, EFeatureFlagKey.tradingOutage, EFeatureFlagKey.gateTTLOverrides, EFeatureFlagKey.resolvedPositionsBanner, EFeatureFlagKey.cancelWithdrawal, EFeatureFlagKey.criticalMaintenance, EFeatureFlagKey.exploreSpecialEventBanner, EFeatureFlagKey.calendarPnl, EFeatureFlagKey.nflHubEnabled, EFeatureFlagKey.nflHubPlayoffsTabEnabled, EFeatureFlagKey.midtermsHubEnabled, EFeatureFlagKey.nflLiveMarkets, EFeatureFlagKey.footballSplashEnabled, EFeatureFlagKey.intercomSupport, EFeatureFlagKey.chatEnabled, EFeatureFlagKey.squadsImageUploads, EFeatureFlagKey.squadsPhotoPositions, EFeatureFlagKey.eventChatImageSharing, EFeatureFlagKey.chatExcludedTags, EFeatureFlagKey.chatPositionFlairSteps, EFeatureFlagKey.chatPlayByPlaySenderUsername, EFeatureFlagKey.chatSquadStatusSenderUsername, EFeatureFlagKey.chatPolymarketUserId, EFeatureFlagKey.chatMentionsEnabled, EFeatureFlagKey.chatSquadInvitesEnabled, EFeatureFlagKey.marketMentionsEnabled, EFeatureFlagKey.maxImageReactions, EFeatureFlagKey.maxPositionShares, EFeatureFlagKey.selfieShareCaptionText, EFeatureFlagKey.promoBannerTemplates, EFeatureFlagKey.showPromoCodeSettingsEntry, EFeatureFlagKey.liquidityRewardTags, EFeatureFlagKey.liveTradeEnabled, EFeatureFlagKey.liveTradeLeagueTags, EFeatureFlagKey.liveTradeExcludedEventSlugs, EFeatureFlagKey.gameSwitcherLeagueSlugs, EFeatureFlagKey.liveTradePriceImpactWarningThresholdPercent, EFeatureFlagKey.tradeWidgetSlippageWarningThresholdPercent, EFeatureFlagKey.livestreamAutoPiPEnabled, EFeatureFlagKey.combosEnabled, EFeatureFlagKey.combosHomeBuildComboButtonEnabled, EFeatureFlagKey.premadeCombosRail, EFeatureFlagKey.tradeSheetComboEntry, EFeatureFlagKey.pickemPopularProps, EFeatureFlagKey.pickemTagPropPills, EFeatureFlagKey.pregameStatsSheet, EFeatureFlagKey.removeStoredPaymentMethod, EFeatureFlagKey.paymentMethodBillingAddressPrefill, EFeatureFlagKey.minimumDepositAmountUsd, EFeatureFlagKey.minimumEventVolumeUsd, EFeatureFlagKey.depositLimits, EFeatureFlagKey.whaleDepositGate, EFeatureFlagKey.rfiWebViewUrl, EFeatureFlagKey.smsReverifyEnabled, EFeatureFlagKey.onboardingWebViewUrl, EFeatureFlagKey.tycWebViewUrl, EFeatureFlagKey.bugReportShake, EFeatureFlagKey.stripePayments, EFeatureFlagKey.paypal, EFeatureFlagKey.venmo, EFeatureFlagKey.stripeLink, EFeatureFlagKey.stripeCardNameFromKyc, EFeatureFlagKey.creditCards, EFeatureFlagKey.depositContext, EFeatureFlagKey.autoRailDeposits, EFeatureFlagKey.kycStatusDocvSignal, EFeatureFlagKey.androidDocvStableActivity, EFeatureFlagKey.smsMfaEnabled, EFeatureFlagKey.auth0HTTPSCallbackEnabled, EFeatureFlagKey.mintPasskeyInSettings, EFeatureFlagKey.mfaChallengePreKyc, EFeatureFlagKey.kycPrefillOtpBridge, EFeatureFlagKey.deduplicateSigninByPhone, EFeatureFlagKey.refreshUserOnWebOnboardingComplete, EFeatureFlagKey.webOnboarding, EFeatureFlagKey.onboardingRouteByKYCState, EFeatureFlagKey.singleTunnelOnboarding, EFeatureFlagKey.ep3ClaimsAcquisition, EFeatureFlagKey.exchangeAccountReadGate, EFeatureFlagKey.excludedMarketingAttributeTags, EFeatureFlagKey.registration, EFeatureFlagKey.networkHealthMonitor, EFeatureFlagKey.promotionCompetitionsEnabled, EFeatureFlagKey.userReferralsEnabled, EFeatureFlagKey.referralCardBackgroundImageURL, EFeatureFlagKey.chatRepliesEnabled, EFeatureFlagKey.showChatPriceFlurries, EFeatureFlagKey.connectGatewayEnabled, EFeatureFlagKey.gatewayRouteMap, EFeatureFlagKey.realtimeStreamFeeds, EFeatureFlagKey.p2ExchangeHeader, EFeatureFlagKey.activityHistoryRetentionPeriod, EFeatureFlagKey.marketPriceThrottleEnabled, EFeatureFlagKey.squadsRealtimePositionCards, EFeatureFlagKey.squadsRealtimePositionCardPrices, EFeatureFlagKey.squadsOutage, EFeatureFlagKey.squadsTutorial, EFeatureFlagKey.squadsRealtimeRefreshJitter, EFeatureFlagKey.eventActivityEnabled, EFeatureFlagKey.promotionalSMSConsent, EFeatureFlagKey.geoBlockedConfig, EFeatureFlagKey.geoShadowMode, EFeatureFlagKey.webLinks, EFeatureFlagKey.marketResolutionUX, EFeatureFlagKey.marketResolutionUXCombos, EFeatureFlagKey.spreadRulesClientFlip, EFeatureFlagKey.marketingCampaigns, EFeatureFlagKey.americanOddsEnabled, EFeatureFlagKey.loggedOutSupportGate, EFeatureFlagKey.bonusBalanceBreakdown, EFeatureFlagKey.inAppToastsEnabled, EFeatureFlagKey.limitOrderSideToggle, EFeatureFlagKey.teamChatOutage, EFeatureFlagKey.livePerfOptimizations, EFeatureFlagKey.incrementalMarketSubscriptions, EFeatureFlagKey.tabScopedMarketSubscriptions, EFeatureFlagKey.selfMatchRecovery);
        }

        public final Set<EFeatureFlagKey> getLiveUpdating() {
            return Swift_Companion_liveUpdating();
        }

        public final EFeatureFlagKey init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -2141049898:
                    if (!rawValue.equals("configuration_chat_polymarket_user_id")) {
                        return null;
                    }
                    return EFeatureFlagKey.chatPolymarketUserId;
                case -2114983533:
                    if (rawValue.equals("killswitch_kyc_status_docv_signal")) {
                        return EFeatureFlagKey.kycStatusDocvSignal;
                    }
                    return null;
                case -2094725093:
                    if (rawValue.equals("rollout_spread_rules_client_flip")) {
                        return EFeatureFlagKey.spreadRulesClientFlip;
                    }
                    return null;
                case -2087683089:
                    if (rawValue.equals("killswitch_google_pay")) {
                        return EFeatureFlagKey.googlePay;
                    }
                    return null;
                case -2079549527:
                    if (rawValue.equals("rollout_squads_realtime_position_cards")) {
                        return EFeatureFlagKey.squadsRealtimePositionCards;
                    }
                    return null;
                case -2048758689:
                    if (rawValue.equals("killswitch_payment_method_billing_address_prefill")) {
                        return EFeatureFlagKey.paymentMethodBillingAddressPrefill;
                    }
                    return null;
                case -1970581214:
                    if (rawValue.equals("rollout_pickem_popular_props")) {
                        return EFeatureFlagKey.pickemPopularProps;
                    }
                    return null;
                case -1954304097:
                    if (rawValue.equals("rollout_live_trade")) {
                        return EFeatureFlagKey.liveTradeEnabled;
                    }
                    return null;
                case -1924253151:
                    if (rawValue.equals("rollout_market_resolution_ux")) {
                        return EFeatureFlagKey.marketResolutionUX;
                    }
                    return null;
                case -1895442989:
                    if (rawValue.equals("configuration_liquidity_reward_tags")) {
                        return EFeatureFlagKey.liquidityRewardTags;
                    }
                    return null;
                case -1885815712:
                    if (rawValue.equals("rollout_sms_reverify")) {
                        return EFeatureFlagKey.smsReverifyEnabled;
                    }
                    return null;
                case -1883651294:
                    if (rawValue.equals("configuration_gateway_route_map")) {
                        return EFeatureFlagKey.gatewayRouteMap;
                    }
                    return null;
                case -1882614939:
                    if (rawValue.equals("killswitch_chat")) {
                        return EFeatureFlagKey.chatEnabled;
                    }
                    return null;
                case -1841811754:
                    if (rawValue.equals("killswitch_live_perf_optimizations")) {
                        return EFeatureFlagKey.livePerfOptimizations;
                    }
                    return null;
                case -1834539434:
                    if (rawValue.equals("killswitch_apple_pay")) {
                        return EFeatureFlagKey.applePay;
                    }
                    return null;
                case -1832084259:
                    if (rawValue.equals("rollout_nfl_live_markets")) {
                        return EFeatureFlagKey.nflLiveMarkets;
                    }
                    return null;
                case -1817504342:
                    if (rawValue.equals("configuration_tyc_web_view_url")) {
                        return EFeatureFlagKey.tycWebViewUrl;
                    }
                    return null;
                case -1690613120:
                    if (rawValue.equals("rollout_deposit_context")) {
                        return EFeatureFlagKey.depositContext;
                    }
                    return null;
                case -1682221815:
                    if (rawValue.equals("configuration_gate_ttl_overrides")) {
                        return EFeatureFlagKey.gateTTLOverrides;
                    }
                    return null;
                case -1650213807:
                    if (rawValue.equals("rollout_stripe_payments")) {
                        return EFeatureFlagKey.stripePayments;
                    }
                    return null;
                case -1552207622:
                    if (rawValue.equals("rollout_p2_exchange_header")) {
                        return EFeatureFlagKey.p2ExchangeHeader;
                    }
                    return null;
                case -1483322337:
                    if (rawValue.equals("rollout_squads_realtime_position_card_prices")) {
                        return EFeatureFlagKey.squadsRealtimePositionCardPrices;
                    }
                    return null;
                case -1481076400:
                    if (rawValue.equals("rollout_user_referrals")) {
                        return EFeatureFlagKey.userReferralsEnabled;
                    }
                    return null;
                case -1480254800:
                    if (rawValue.equals("configuration_chat_excluded_tags")) {
                        return EFeatureFlagKey.chatExcludedTags;
                    }
                    return null;
                case -1425767777:
                    if (rawValue.equals("rollout_emoji_battle")) {
                        return EFeatureFlagKey.emojiBattle;
                    }
                    return null;
                case -1414230805:
                    if (rawValue.equals("rollout_football_splash")) {
                        return EFeatureFlagKey.footballSplashEnabled;
                    }
                    return null;
                case -1391912592:
                    if (rawValue.equals("killswitch_explore_special_event_banner")) {
                        return EFeatureFlagKey.exploreSpecialEventBanner;
                    }
                    return null;
                case -1344362743:
                    if (rawValue.equals("rollout_stripe_card_name_from_kyc")) {
                        return EFeatureFlagKey.stripeCardNameFromKyc;
                    }
                    return null;
                case -1326773566:
                    if (rawValue.equals("rollout_chat_mentions")) {
                        return EFeatureFlagKey.chatMentionsEnabled;
                    }
                    return null;
                case -1139993037:
                    if (rawValue.equals("configuration_live_trade_excluded_event_slugs")) {
                        return EFeatureFlagKey.liveTradeExcludedEventSlugs;
                    }
                    return null;
                case -1088660356:
                    if (rawValue.equals("killswitch_logged_out_support_gate")) {
                        return EFeatureFlagKey.loggedOutSupportGate;
                    }
                    return null;
                case -1049380569:
                    if (rawValue.equals("rollout_deposit_limits")) {
                        return EFeatureFlagKey.depositLimits;
                    }
                    return null;
                case -1042870457:
                    if (rawValue.equals("killswitch_geo_shadow_mode")) {
                        return EFeatureFlagKey.geoShadowMode;
                    }
                    return null;
                case -1006250890:
                    if (rawValue.equals("rollout_trading_self_match_recovery")) {
                        return EFeatureFlagKey.selfMatchRecovery;
                    }
                    return null;
                case -932427467:
                    if (rawValue.equals("configuration_geo_blocked")) {
                        return EFeatureFlagKey.geoBlockedConfig;
                    }
                    return null;
                case -849618892:
                    if (rawValue.equals("rollout_web_onboarding")) {
                        return EFeatureFlagKey.webOnboarding;
                    }
                    return null;
                case -816277376:
                    if (rawValue.equals("killswitch_critical_maintenance")) {
                        return EFeatureFlagKey.criticalMaintenance;
                    }
                    return null;
                case -812234502:
                    if (rawValue.equals("rollout_resolved_positions_banner")) {
                        return EFeatureFlagKey.resolvedPositionsBanner;
                    }
                    return null;
                case -796261005:
                    if (rawValue.equals("rollout_venmo")) {
                        return EFeatureFlagKey.venmo;
                    }
                    return null;
                case -790561270:
                    if (rawValue.equals("rollout_ep3_claims_acquisition")) {
                        return EFeatureFlagKey.ep3ClaimsAcquisition;
                    }
                    return null;
                case -782510386:
                    if (rawValue.equals("killswitch_withdrawal_outage")) {
                        return EFeatureFlagKey.withdrawalOutage;
                    }
                    return null;
                case -780695957:
                    if (rawValue.equals("rollout_credit_cards")) {
                        return EFeatureFlagKey.creditCards;
                    }
                    return null;
                case -770802661:
                    if (rawValue.equals("configuration_squads_tutorial")) {
                        return EFeatureFlagKey.squadsTutorial;
                    }
                    return null;
                case -722085109:
                    if (rawValue.equals("configuration_whale_deposit_gate")) {
                        return EFeatureFlagKey.whaleDepositGate;
                    }
                    return null;
                case -716115536:
                    if (rawValue.equals("rollout_refresh_user_web_onboarding_complete")) {
                        return EFeatureFlagKey.refreshUserOnWebOnboardingComplete;
                    }
                    return null;
                case -701629511:
                    if (rawValue.equals("rollout_limit_order_side_toggle")) {
                        return EFeatureFlagKey.limitOrderSideToggle;
                    }
                    return null;
                case -610720446:
                    if (rawValue.equals("killswitch_intercom_support")) {
                        return EFeatureFlagKey.intercomSupport;
                    }
                    return null;
                case -566790018:
                    if (rawValue.equals("rollout_auth0_https_callback")) {
                        return EFeatureFlagKey.auth0HTTPSCallbackEnabled;
                    }
                    return null;
                case -549008513:
                    if (rawValue.equals("killswitch_deposit_outage")) {
                        return EFeatureFlagKey.depositOutage;
                    }
                    return null;
                case -544765882:
                    if (rawValue.equals("killswitch_squads")) {
                        return EFeatureFlagKey.squadsOutage;
                    }
                    return null;
                case -523420415:
                    if (rawValue.equals("configuration_system_status_banners")) {
                        return EFeatureFlagKey.systemStatusBanners;
                    }
                    return null;
                case -487622082:
                    if (rawValue.equals("killswitch_apple_pay_withdrawal")) {
                        return EFeatureFlagKey.applePayWithdrawal;
                    }
                    return null;
                case -469889932:
                    if (rawValue.equals("configuration_activity_history_retention_period")) {
                        return EFeatureFlagKey.activityHistoryRetentionPeriod;
                    }
                    return null;
                case -450924170:
                    if (rawValue.equals("configuration_chat_squad_status_sender_username")) {
                        return EFeatureFlagKey.chatSquadStatusSenderUsername;
                    }
                    return null;
                case -441928862:
                    if (rawValue.equals("rollout_event_activity")) {
                        return EFeatureFlagKey.eventActivityEnabled;
                    }
                    return null;
                case -418450571:
                    if (rawValue.equals("killswitch_network_health_monitor")) {
                        return EFeatureFlagKey.networkHealthMonitor;
                    }
                    return null;
                case -412808969:
                    if (rawValue.equals("killswitch_in_app_toasts")) {
                        return EFeatureFlagKey.inAppToastsEnabled;
                    }
                    return null;
                case -378654729:
                    if (rawValue.equals("rollout_chat_price_flurries")) {
                        return EFeatureFlagKey.showChatPriceFlurries;
                    }
                    return null;
                case -369343910:
                    if (rawValue.equals("configuration_american_odds")) {
                        return EFeatureFlagKey.americanOddsEnabled;
                    }
                    return null;
                case -369212703:
                    if (rawValue.equals("configuration_excluded_marketing_attribute_tags")) {
                        return EFeatureFlagKey.excludedMarketingAttributeTags;
                    }
                    return null;
                case -305365637:
                    if (rawValue.equals("rollout_calendar_pnl")) {
                        return EFeatureFlagKey.calendarPnl;
                    }
                    return null;
                case -226162192:
                    if (rawValue.equals("configuration_chat_play_by_play_sender_username")) {
                        return EFeatureFlagKey.chatPlayByPlaySenderUsername;
                    }
                    return null;
                case -196741536:
                    if (rawValue.equals("rollout_auto_rail_deposits")) {
                        return EFeatureFlagKey.autoRailDeposits;
                    }
                    return null;
                case -165789246:
                    if (rawValue.equals("killswitch_connect_gateway")) {
                        return EFeatureFlagKey.connectGatewayEnabled;
                    }
                    return null;
                case -164991752:
                    if (rawValue.equals("rollout_trade_sheet_combo_entry")) {
                        return EFeatureFlagKey.tradeSheetComboEntry;
                    }
                    return null;
                case -162932287:
                    if (rawValue.equals("configuration_marketing_campaigns")) {
                        return EFeatureFlagKey.marketingCampaigns;
                    }
                    return null;
                case -138820715:
                    if (rawValue.equals("configuration_trade_widget_slippage_warning_threshold_percent")) {
                        return EFeatureFlagKey.tradeWidgetSlippageWarningThresholdPercent;
                    }
                    return null;
                case -109296810:
                    if (rawValue.equals("killswitch_market_price_throttle")) {
                        return EFeatureFlagKey.marketPriceThrottleEnabled;
                    }
                    return null;
                case -73888826:
                    if (rawValue.equals("killswitch_registration")) {
                        return EFeatureFlagKey.registration;
                    }
                    return null;
                case -68503508:
                    if (rawValue.equals("rollout_chat_squad_invites")) {
                        return EFeatureFlagKey.chatSquadInvitesEnabled;
                    }
                    return null;
                case -50234709:
                    if (rawValue.equals("killswitch_tab_scoped_market_subscriptions")) {
                        return EFeatureFlagKey.tabScopedMarketSubscriptions;
                    }
                    return null;
                case -6934102:
                    if (rawValue.equals("rollout_promo_code_settings_entry")) {
                        return EFeatureFlagKey.showPromoCodeSettingsEntry;
                    }
                    return null;
                case 83033101:
                    if (rawValue.equals("killswitch_team_chat")) {
                        return EFeatureFlagKey.teamChatOutage;
                    }
                    return null;
                case 91312165:
                    if (rawValue.equals("rollout_squads_photo_positions")) {
                        return EFeatureFlagKey.squadsPhotoPositions;
                    }
                    return null;
                case 101360367:
                    if (rawValue.equals("rollout_chat_replies")) {
                        return EFeatureFlagKey.chatRepliesEnabled;
                    }
                    return null;
                case 140425671:
                    if (rawValue.equals("configuration_squads_realtime_refresh_jitter")) {
                        return EFeatureFlagKey.squadsRealtimeRefreshJitter;
                    }
                    return null;
                case 142755564:
                    if (rawValue.equals("rollout_livestream_auto_pip")) {
                        return EFeatureFlagKey.livestreamAutoPiPEnabled;
                    }
                    return null;
                case 174369396:
                    if (rawValue.equals("configuration_selfie_share_caption_text")) {
                        return EFeatureFlagKey.selfieShareCaptionText;
                    }
                    return null;
                case 175711957:
                    if (rawValue.equals("killswitch_sms_mfa")) {
                        return EFeatureFlagKey.smsMfaEnabled;
                    }
                    return null;
                case 175874731:
                    if (rawValue.equals("rollout_pickem_tag_prop_pills")) {
                        return EFeatureFlagKey.pickemTagPropPills;
                    }
                    return null;
                case 199648616:
                    if (rawValue.equals("rollout_sports_pills")) {
                        return EFeatureFlagKey.sportsPills;
                    }
                    return null;
                case 261317759:
                    if (rawValue.equals("configuration_promo_banner_templates")) {
                        return EFeatureFlagKey.promoBannerTemplates;
                    }
                    return null;
                case 334323200:
                    if (rawValue.equals("rollout_combos_build_combo_button")) {
                        return EFeatureFlagKey.combosHomeBuildComboButtonEnabled;
                    }
                    return null;
                case 360572580:
                    if (rawValue.equals("configuration_live_trade_league_tags")) {
                        return EFeatureFlagKey.liveTradeLeagueTags;
                    }
                    return null;
                case 459200753:
                    if (rawValue.equals("rollout_nfl_hub_playoffs_tab")) {
                        return EFeatureFlagKey.nflHubPlayoffsTabEnabled;
                    }
                    return null;
                case 550953715:
                    if (rawValue.equals("rollout_combos")) {
                        return EFeatureFlagKey.combosEnabled;
                    }
                    return null;
                case 554732768:
                    if (rawValue.equals("configuration_minimum_event_volume_usd")) {
                        return EFeatureFlagKey.minimumEventVolumeUsd;
                    }
                    return null;
                case 572173491:
                    if (rawValue.equals("killswitch_bug_report_shake")) {
                        return EFeatureFlagKey.bugReportShake;
                    }
                    return null;
                case 630937393:
                    if (rawValue.equals("configuration_chat_max_position_shares")) {
                        return EFeatureFlagKey.maxPositionShares;
                    }
                    return null;
                case 665305942:
                    if (rawValue.equals("killswitch_promotional_sms_consent")) {
                        return EFeatureFlagKey.promotionalSMSConsent;
                    }
                    return null;
                case 666255593:
                    if (rawValue.equals("rollout_single_tunnel_onboarding")) {
                        return EFeatureFlagKey.singleTunnelOnboarding;
                    }
                    return null;
                case 673573801:
                    if (rawValue.equals("rollout_remove_stored_payment_method")) {
                        return EFeatureFlagKey.removeStoredPaymentMethod;
                    }
                    return null;
                case 762875678:
                    if (rawValue.equals("rollout_stripe_link")) {
                        return EFeatureFlagKey.stripeLink;
                    }
                    return null;
                case 813620060:
                    if (rawValue.equals("rollout_nfl_hub")) {
                        return EFeatureFlagKey.nflHubEnabled;
                    }
                    return null;
                case 844476954:
                    if (rawValue.equals("configuration_minimum_deposit_amount_usd")) {
                        return EFeatureFlagKey.minimumDepositAmountUsd;
                    }
                    return null;
                case 881827346:
                    if (rawValue.equals("configuration_game_switcher_league_slugs")) {
                        return EFeatureFlagKey.gameSwitcherLeagueSlugs;
                    }
                    return null;
                case 910573889:
                    if (rawValue.equals("rollout_paypal")) {
                        return EFeatureFlagKey.paypal;
                    }
                    return null;
                case 934296604:
                    if (rawValue.equals("killswitch_mint_passkey_in_settings")) {
                        return EFeatureFlagKey.mintPasskeyInSettings;
                    }
                    return null;
                case 936529027:
                    if (rawValue.equals("rollout_market_resolution_ux_combos")) {
                        return EFeatureFlagKey.marketResolutionUXCombos;
                    }
                    return null;
                case 957321325:
                    if (rawValue.equals("configuration_chat_max_image_reactions")) {
                        return EFeatureFlagKey.maxImageReactions;
                    }
                    return null;
                case 989676670:
                    if (rawValue.equals("rollout_team_blob_gradient")) {
                        return EFeatureFlagKey.teamBlobGradient;
                    }
                    return null;
                case 1003735535:
                    if (rawValue.equals("killswitch_apple_cash_withdrawal")) {
                        return EFeatureFlagKey.appleCashWithdrawal;
                    }
                    return null;
                case 1005432436:
                    if (rawValue.equals("rollout_exchange_account_read_gate")) {
                        return EFeatureFlagKey.exchangeAccountReadGate;
                    }
                    return null;
                case 1036614151:
                    if (rawValue.equals("rollout_pregame_stats_sheet")) {
                        return EFeatureFlagKey.pregameStatsSheet;
                    }
                    return null;
                case 1104039107:
                    if (rawValue.equals("rollout_midterms_hub")) {
                        return EFeatureFlagKey.midtermsHubEnabled;
                    }
                    return null;
                case 1115362782:
                    if (rawValue.equals("rollout_market_mentions")) {
                        return EFeatureFlagKey.marketMentionsEnabled;
                    }
                    return null;
                case 1224796976:
                    if (rawValue.equals("rollout_android_docv_stable_activity")) {
                        return EFeatureFlagKey.androidDocvStableActivity;
                    }
                    return null;
                case 1338342142:
                    if (rawValue.equals("rollout_promotion_competitions")) {
                        return EFeatureFlagKey.promotionCompetitionsEnabled;
                    }
                    return null;
                case 1419170716:
                    if (rawValue.equals("killswitch_trading_outage")) {
                        return EFeatureFlagKey.tradingOutage;
                    }
                    return null;
                case 1442418640:
                    if (rawValue.equals("rollout_bonus_balance_breakdown")) {
                        return EFeatureFlagKey.bonusBalanceBreakdown;
                    }
                    return null;
                case 1465568688:
                    if (rawValue.equals("configuration_live_trade_price_impact_warning_threshold_percent")) {
                        return EFeatureFlagKey.liveTradePriceImpactWarningThresholdPercent;
                    }
                    return null;
                case 1482067054:
                    if (rawValue.equals("rollout_kyc_prefill_otp_bridge")) {
                        return EFeatureFlagKey.kycPrefillOtpBridge;
                    }
                    return null;
                case 1504213852:
                    if (rawValue.equals("rollout_realtime_stream_feeds")) {
                        return EFeatureFlagKey.realtimeStreamFeeds;
                    }
                    return null;
                case 1686824600:
                    if (rawValue.equals("rollout_mfa_challenge_pre_kyc")) {
                        return EFeatureFlagKey.mfaChallengePreKyc;
                    }
                    return null;
                case 1727821908:
                    if (rawValue.equals("configuration_chat_position_flair_steps")) {
                        return EFeatureFlagKey.chatPositionFlairSteps;
                    }
                    return null;
                case 1739120501:
                    if (rawValue.equals("killswitch_squads_image_uploads")) {
                        return EFeatureFlagKey.squadsImageUploads;
                    }
                    return null;
                case 1886466259:
                    if (rawValue.equals("configuration_rfi_web_view_url")) {
                        return EFeatureFlagKey.rfiWebViewUrl;
                    }
                    return null;
                case 1888753124:
                    if (rawValue.equals("rollout_event_chat_image_sharing")) {
                        return EFeatureFlagKey.eventChatImageSharing;
                    }
                    return null;
                case 1909656144:
                    if (rawValue.equals("configuration_referral_card_background_image_url")) {
                        return EFeatureFlagKey.referralCardBackgroundImageURL;
                    }
                    return null;
                case 1971382231:
                    if (rawValue.equals("rollout_premade_combos_rail")) {
                        return EFeatureFlagKey.premadeCombosRail;
                    }
                    return null;
                case 1976075231:
                    if (rawValue.equals("rollout_play_by_play")) {
                        return EFeatureFlagKey.playByPlay;
                    }
                    return null;
                case 2040898053:
                    if (rawValue.equals("killswitch_incremental_market_subscriptions")) {
                        return EFeatureFlagKey.incrementalMarketSubscriptions;
                    }
                    return null;
                case 2069349728:
                    if (rawValue.equals("rollout_deduplicate_signin_by_phone")) {
                        return EFeatureFlagKey.deduplicateSigninByPhone;
                    }
                    return null;
                case 2071978757:
                    if (rawValue.equals("configuration_web_links")) {
                        return EFeatureFlagKey.webLinks;
                    }
                    return null;
                case 2106193036:
                    if (rawValue.equals("rollout_cancel_withdrawal")) {
                        return EFeatureFlagKey.cancelWithdrawal;
                    }
                    return null;
                case 2114796395:
                    if (rawValue.equals("rollout_onboarding_route_by_kyc_state")) {
                        return EFeatureFlagKey.onboardingRouteByKYCState;
                    }
                    return null;
                case 2134377838:
                    if (rawValue.equals("configuration_onboarding_webview_url")) {
                        return EFeatureFlagKey.onboardingWebViewUrl;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private EFeatureFlagKey(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
