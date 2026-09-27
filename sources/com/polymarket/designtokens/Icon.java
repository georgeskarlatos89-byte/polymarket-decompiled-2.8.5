package com.polymarket.designtokens;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.ExpressibleByStringLiteral;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0003\bÝ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 ì\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0004ë\u0001ì\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010å\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u001c\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010æ\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001¨\u0006í\u0001"}, d2 = {"Lcom/polymarket/designtokens/Icon;", "Lskip/lib/ExpressibleByStringLiteral;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "chessLogo", "animatedChessBackground", "polymarketLogoOnly", "polymarketLogoGlyph", "polymarketLogoTextOnly", "backButton", "homeBold", "searchBold", "searchInputBold", "inboxBold", "settingBold", "editIcon", "caretDownBold", "caretLeftBold", "caretRightBold", "caretUp", "caretDown", "caretUpDownBold", "chevronReduceY", "chevronExpandY", "expand", "doubleChevronRight", "xBold", "discordBold", "barChartBold", "lineChartBold", "planeBold", "moreVerticalBold", "bellBold", "folderTransferBold", "moonBold", "moonStarsBold", "touchBold", "shieldBold", "usersBold", "sunBold", "clipboardBold", "closeBold", "clearBold", "xLogoBold", "boxBold", "chevronDownBold", "chevronRightBold", "chevronUpBold", "chatIconBold", "listMenu", "chevronUpBold2", "trash", "copy", "warning", "checkBold", "infoBold", "externalLinkBold", "sortBold", "awardBold", "lightningBold", "marketBold", "userCircleBold", "userBold", "userFill", "userOutline", "explore", "exploreFilled", "liveNav", "searchNav", "tabGroups", "tabGroupsFilled", "muteFilled", "mutedFilled", "nicknameFilled", "mention", "deleteFilled", "qrCode", "calBold", "codeBold", "pinBold", "chatPinIcon", "profileFrame", "currencyCircleBold", "dollarBold", "dollarUnavailableBold", "arrowDiagonalBold", "logoutBold", "creditCardBold", "bankBold", "notificationsBold", "arrowLineUpBold", "arrowLineDownBold", "arrowUp", "lockBold", "lockFill", "faceID", "tapBold", "transferBold", "chatBold", "phoneBold", "idCardBold", "waveBold", "mailBold", PlaceTypes.STADIUM, "bookBold", "recenterBold", "lineLimitBold", "taxDocumentsBold", "documentBold", "filterBold", "stackBold", "ticketBold", "speedometerBold", "pendingClockBold", "hourglassBold", "dollarCircleBold", "wallet", "quickSwitcher", "gridMode", "liveChart", "refresh", "cardVisa", "cardMastercard", "cardAmex", "cardDiscover", "cardJcb", "cardDiners", "cardMaestro", "cardMada", "apple", "appleBold", "google", "paypal", "venmo", "instaBold", "homeFill", "searchFill", "inboxFill", "settingFill", "crownFill", "userCircleFill", "notificationsFill", "infoFill", "plusFill", "checkCircleFill", "ticketFill", "ticketOutline", "tieFill", "equalArrows", "cashOutBold", "xCircleFill", "winLaurelFill", "asteriskSF", "membershipSF", "reportSF", "copySF", "playButtonSF", "walletSF", "usernameSF", "gameSF", "wagerSF", "timerSF", "checkmarkSF", "xmarkSF", "plus", "gear", "play", "questionCircleSF", "giftSF", "bookmarkSF", "bookmarkFillSF", "commentSF", "tradeSF", "locationSF", "imageGeoblock", "imageVpn", "imageNoMarket", "imageNoDeposit", "ellipsis", "heart", "heartFill", "heartSF", "reply", "clock", "clockFull", "oddsPercentage", "oddsAmerican", "oddsPrice", "football", "baseballBat", "imageCoins", "imageCone", "imageSuspended", "imageFolder", "imageLogin", "imageBell", "imageTicket", "imageSelfieFilter", "imageCheckmark", "imageChatEmptyIllo", "imageEventEmptyIllo", "imageStopclock", "imageDepositIllo", "imageCashLock", "polymarketEmployeeBadge", "flameFill", "flame", "flameCheck", "shieldWarning", "exclamation", "key", "comingSoon", "verified", "mutedIcon", "plusIcon", "sendIcon", "circleQuestion", "circleQuestionFilled", "userPlusFilled", "xmarkSmall", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Metadata", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Icon implements ExpressibleByStringLiteral, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Icon[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final Icon chessLogo = new Icon("chessLogo", 0, "chessLogo", null, 2, null);
    public static final Icon animatedChessBackground = new Icon("animatedChessBackground", 1, "animatedChessBackground", null, 2, null);
    public static final Icon polymarketLogoOnly = new Icon("polymarketLogoOnly", 2, "polymarketLogoOnly", null, 2, null);
    public static final Icon polymarketLogoGlyph = new Icon("polymarketLogoGlyph", 3, "polymarketLogoGlyph", null, 2, null);
    public static final Icon polymarketLogoTextOnly = new Icon("polymarketLogoTextOnly", 4, "polymarketLogoTextOnly", null, 2, null);
    public static final Icon backButton = new Icon("backButton", 5, "backButton", null, 2, null);
    public static final Icon homeBold = new Icon("homeBold", 6, "homeBold", null, 2, null);
    public static final Icon searchBold = new Icon("searchBold", 7, "searchBold", null, 2, null);
    public static final Icon searchInputBold = new Icon("searchInputBold", 8, "searchInputBold", null, 2, null);
    public static final Icon inboxBold = new Icon("inboxBold", 9, "inboxBold", null, 2, null);
    public static final Icon settingBold = new Icon("settingBold", 10, "settingBold", null, 2, null);
    public static final Icon editIcon = new Icon("editIcon", 11, "editIcon", null, 2, null);
    public static final Icon caretDownBold = new Icon("caretDownBold", 12, "caretDownBold", null, 2, null);
    public static final Icon caretLeftBold = new Icon("caretLeftBold", 13, "caretLeftBold", null, 2, null);
    public static final Icon caretRightBold = new Icon("caretRightBold", 14, "caretRightBold", null, 2, null);
    public static final Icon caretUp = new Icon("caretUp", 15, "caretUp", null, 2, null);
    public static final Icon caretDown = new Icon("caretDown", 16, "caretDown", null, 2, null);
    public static final Icon caretUpDownBold = new Icon("caretUpDownBold", 17, "caretUpDownBold", null, 2, null);
    public static final Icon chevronReduceY = new Icon("chevronReduceY", 18, "chevronReduceY", null, 2, null);
    public static final Icon chevronExpandY = new Icon("chevronExpandY", 19, "chevronExpandY", null, 2, null);
    public static final Icon expand = new Icon("expand", 20, "expand", null, 2, null);
    public static final Icon doubleChevronRight = new Icon("doubleChevronRight", 21, "doubleChevronRight", null, 2, null);
    public static final Icon xBold = new Icon("xBold", 22, "xBold", null, 2, null);
    public static final Icon discordBold = new Icon("discordBold", 23, "discordBold", null, 2, null);
    public static final Icon barChartBold = new Icon("barChartBold", 24, "barChartBold", null, 2, null);
    public static final Icon lineChartBold = new Icon("lineChartBold", 25, "lineChartBold", null, 2, null);
    public static final Icon planeBold = new Icon("planeBold", 26, "planeBold", null, 2, null);
    public static final Icon moreVerticalBold = new Icon("moreVerticalBold", 27, "moreVerticalBold", null, 2, null);
    public static final Icon bellBold = new Icon("bellBold", 28, "bellBold", null, 2, null);
    public static final Icon folderTransferBold = new Icon("folderTransferBold", 29, "folderTransferBold", null, 2, null);
    public static final Icon moonBold = new Icon("moonBold", 30, "moonBold", null, 2, null);
    public static final Icon moonStarsBold = new Icon("moonStarsBold", 31, "moonStarsBold", null, 2, null);
    public static final Icon touchBold = new Icon("touchBold", 32, "touchBold", null, 2, null);
    public static final Icon shieldBold = new Icon("shieldBold", 33, "shieldBold", null, 2, null);
    public static final Icon usersBold = new Icon("usersBold", 34, "usersBold", null, 2, null);
    public static final Icon sunBold = new Icon("sunBold", 35, "sunBold", null, 2, null);
    public static final Icon clipboardBold = new Icon("clipboardBold", 36, "clipboardBold", null, 2, null);
    public static final Icon closeBold = new Icon("closeBold", 37, "closeBold", null, 2, null);
    public static final Icon clearBold = new Icon("clearBold", 38, "clearBold", null, 2, null);
    public static final Icon xLogoBold = new Icon("xLogoBold", 39, "xLogoBold", null, 2, null);
    public static final Icon boxBold = new Icon("boxBold", 40, "boxBold", null, 2, null);
    public static final Icon chevronDownBold = new Icon("chevronDownBold", 41, "chevronDownBold", null, 2, null);
    public static final Icon chevronRightBold = new Icon("chevronRightBold", 42, "chevronRightBold", null, 2, null);
    public static final Icon chevronUpBold = new Icon("chevronUpBold", 43, "chevronUpBold", null, 2, null);
    public static final Icon chatIconBold = new Icon("chatIconBold", 44, "chatIconBold", null, 2, null);
    public static final Icon listMenu = new Icon("listMenu", 45, "listMenu", null, 2, null);
    public static final Icon chevronUpBold2 = new Icon("chevronUpBold2", 46, "chevronUpBold2", null, 2, null);
    public static final Icon trash = new Icon("trash", 47, "trash", null, 2, null);
    public static final Icon copy = new Icon("copy", 48, "copy", null, 2, null);
    public static final Icon warning = new Icon("warning", 49, "warning", null, 2, null);
    public static final Icon checkBold = new Icon("checkBold", 50, "checkBold", null, 2, null);
    public static final Icon infoBold = new Icon("infoBold", 51, "infoBold", null, 2, null);
    public static final Icon externalLinkBold = new Icon("externalLinkBold", 52, "externalLinkBold", null, 2, null);
    public static final Icon sortBold = new Icon("sortBold", 53, "sortBold", null, 2, null);
    public static final Icon awardBold = new Icon("awardBold", 54, "awardBold", null, 2, null);
    public static final Icon lightningBold = new Icon("lightningBold", 55, "lightningBold", null, 2, null);
    public static final Icon marketBold = new Icon("marketBold", 56, "marketBold", null, 2, null);
    public static final Icon userCircleBold = new Icon("userCircleBold", 57, "userCircleBold", null, 2, null);
    public static final Icon userBold = new Icon("userBold", 58, "userBold", null, 2, null);
    public static final Icon userFill = new Icon("userFill", 59, "userFill", null, 2, null);
    public static final Icon userOutline = new Icon("userOutline", 60, "userOutline", null, 2, null);
    public static final Icon explore = new Icon("explore", 61, "explore", null, 2, null);
    public static final Icon exploreFilled = new Icon("exploreFilled", 62, "exploreFilled", null, 2, null);
    public static final Icon liveNav = new Icon("liveNav", 63, "liveNav", null, 2, null);
    public static final Icon searchNav = new Icon("searchNav", 64, "searchNav", null, 2, null);
    public static final Icon tabGroups = new Icon("tabGroups", 65, "tabGroups", null, 2, null);
    public static final Icon tabGroupsFilled = new Icon("tabGroupsFilled", 66, "tabGroupsFilled", null, 2, null);
    public static final Icon muteFilled = new Icon("muteFilled", 67, "muteFilled", null, 2, null);
    public static final Icon mutedFilled = new Icon("mutedFilled", 68, "mutedFilled", null, 2, null);
    public static final Icon nicknameFilled = new Icon("nicknameFilled", 69, "nicknameFilled", null, 2, null);
    public static final Icon mention = new Icon("mention", 70, "mention", null, 2, null);
    public static final Icon deleteFilled = new Icon("deleteFilled", 71, "deleteFilled", null, 2, null);
    public static final Icon qrCode = new Icon("qrCode", 72, "qrCode", null, 2, null);
    public static final Icon calBold = new Icon("calBold", 73, "calBold", null, 2, null);
    public static final Icon codeBold = new Icon("codeBold", 74, "codeBold", null, 2, null);
    public static final Icon pinBold = new Icon("pinBold", 75, "pinBold", null, 2, null);
    public static final Icon chatPinIcon = new Icon("chatPinIcon", 76, "chatPinIcon", null, 2, null);
    public static final Icon profileFrame = new Icon("profileFrame", 77, "profileFrame", null, 2, null);
    public static final Icon currencyCircleBold = new Icon("currencyCircleBold", 78, "currencyCircleBold", null, 2, null);
    public static final Icon dollarBold = new Icon("dollarBold", 79, "dollarBold", null, 2, null);
    public static final Icon dollarUnavailableBold = new Icon("dollarUnavailableBold", 80, "dollarUnavailableBold", null, 2, null);
    public static final Icon arrowDiagonalBold = new Icon("arrowDiagonalBold", 81, "arrowDiagonalBold", null, 2, null);
    public static final Icon logoutBold = new Icon("logoutBold", 82, "logoutBold", null, 2, null);
    public static final Icon creditCardBold = new Icon("creditCardBold", 83, "creditCardBold", null, 2, null);
    public static final Icon bankBold = new Icon("bankBold", 84, "bankBold", null, 2, null);
    public static final Icon notificationsBold = new Icon("notificationsBold", 85, "notificationsBold", null, 2, null);
    public static final Icon arrowLineUpBold = new Icon("arrowLineUpBold", 86, "arrowLineUpBold", null, 2, null);
    public static final Icon arrowLineDownBold = new Icon("arrowLineDownBold", 87, "arrowLineDownBold", null, 2, null);
    public static final Icon arrowUp = new Icon("arrowUp", 88, "arrowUp", null, 2, null);
    public static final Icon lockBold = new Icon("lockBold", 89, "lockBold", null, 2, null);
    public static final Icon lockFill = new Icon("lockFill", 90, "lockFill", null, 2, null);
    public static final Icon faceID = new Icon("faceID", 91, "faceID", null, 2, null);
    public static final Icon tapBold = new Icon("tapBold", 92, "tapBold", null, 2, null);
    public static final Icon transferBold = new Icon("transferBold", 93, "transferBold", null, 2, null);
    public static final Icon chatBold = new Icon("chatBold", 94, "chatBold", null, 2, null);
    public static final Icon phoneBold = new Icon("phoneBold", 95, "phoneBold", null, 2, null);
    public static final Icon idCardBold = new Icon("idCardBold", 96, "idCardBold", null, 2, null);
    public static final Icon waveBold = new Icon("waveBold", 97, "waveBold", null, 2, null);
    public static final Icon mailBold = new Icon("mailBold", 98, "mailBold", null, 2, null);
    public static final Icon stadium = new Icon(PlaceTypes.STADIUM, 99, PlaceTypes.STADIUM, null, 2, null);
    public static final Icon bookBold = new Icon("bookBold", 100, "bookBold", null, 2, null);
    public static final Icon recenterBold = new Icon("recenterBold", 101, "recenterBold", null, 2, null);
    public static final Icon lineLimitBold = new Icon("lineLimitBold", 102, "lineLimitBold", null, 2, null);
    public static final Icon taxDocumentsBold = new Icon("taxDocumentsBold", HttpStatusCodesKt.HTTP_EARLY_HINTS, "taxDocumentsBold", null, 2, null);
    public static final Icon documentBold = new Icon("documentBold", 104, "documentBold", null, 2, null);
    public static final Icon filterBold = new Icon("filterBold", 105, "filterBold", null, 2, null);
    public static final Icon stackBold = new Icon("stackBold", 106, "stackBold", null, 2, null);
    public static final Icon ticketBold = new Icon("ticketBold", 107, "ticketBold", null, 2, null);
    public static final Icon speedometerBold = new Icon("speedometerBold", 108, "speedometerBold", null, 2, null);
    public static final Icon pendingClockBold = new Icon("pendingClockBold", 109, "pendingClockBold", null, 2, null);
    public static final Icon hourglassBold = new Icon("hourglassBold", 110, "hourglassBold", null, 2, null);
    public static final Icon dollarCircleBold = new Icon("dollarCircleBold", 111, "dollarCircleBold", null, 2, null);
    public static final Icon wallet = new Icon("wallet", 112, "wallet", null, 2, null);
    public static final Icon quickSwitcher = new Icon("quickSwitcher", 113, "quickSwitcher", null, 2, null);
    public static final Icon gridMode = new Icon("gridMode", 114, "gridMode", null, 2, null);
    public static final Icon liveChart = new Icon("liveChart", 115, "liveChart", null, 2, null);
    public static final Icon refresh = new Icon("refresh", 116, "refresh", null, 2, null);
    public static final Icon cardVisa = new Icon("cardVisa", 117, "cardVisa", null, 2, null);
    public static final Icon cardMastercard = new Icon("cardMastercard", 118, "cardMastercard", null, 2, null);
    public static final Icon cardAmex = new Icon("cardAmex", 119, "cardAmex", null, 2, null);
    public static final Icon cardDiscover = new Icon("cardDiscover", 120, "cardDiscover", null, 2, null);
    public static final Icon cardJcb = new Icon("cardJcb", 121, "cardJcb", null, 2, null);
    public static final Icon cardDiners = new Icon("cardDiners", 122, "cardDiners", null, 2, null);
    public static final Icon cardMaestro = new Icon("cardMaestro", 123, "cardMaestro", null, 2, null);
    public static final Icon cardMada = new Icon("cardMada", 124, "cardMada", null, 2, null);
    public static final Icon apple = new Icon("apple", 125, "apple", null, 2, null);
    public static final Icon appleBold = new Icon("appleBold", WebSocketProtocol.PAYLOAD_SHORT, "appleBold", null, 2, null);
    public static final Icon google = new Icon("google", 127, "google", null, 2, null);
    public static final Icon paypal = new Icon("paypal", 128, "paypal", null, 2, null);
    public static final Icon venmo = new Icon("venmo", 129, "venmo", null, 2, null);
    public static final Icon instaBold = new Icon("instaBold", 130, "instaBold", null, 2, null);
    public static final Icon homeFill = new Icon("homeFill", 131, "homeFill", null, 2, null);
    public static final Icon searchFill = new Icon("searchFill", 132, "searchFill", null, 2, null);
    public static final Icon inboxFill = new Icon("inboxFill", 133, "inboxFill", null, 2, null);
    public static final Icon settingFill = new Icon("settingFill", 134, "settingFill", null, 2, null);
    public static final Icon crownFill = new Icon("crownFill", 135, "crownFill", null, 2, null);
    public static final Icon userCircleFill = new Icon("userCircleFill", 136, "userCircleFill", null, 2, null);
    public static final Icon notificationsFill = new Icon("notificationsFill", 137, "notificationsFill", null, 2, null);
    public static final Icon infoFill = new Icon("infoFill", 138, "infoFill", null, 2, null);
    public static final Icon plusFill = new Icon("plusFill", 139, "plusFill", null, 2, null);
    public static final Icon checkCircleFill = new Icon("checkCircleFill", 140, "checkCircleFill", null, 2, null);
    public static final Icon ticketFill = new Icon("ticketFill", 141, "ticketFill", null, 2, null);
    public static final Icon ticketOutline = new Icon("ticketOutline", 142, "ticketOutline", null, 2, null);
    public static final Icon tieFill = new Icon("tieFill", 143, "tieFill", null, 2, null);
    public static final Icon equalArrows = new Icon("equalArrows", 144, "equalArrows", null, 2, null);
    public static final Icon cashOutBold = new Icon("cashOutBold", 145, "cashOutBold", null, 2, null);
    public static final Icon xCircleFill = new Icon("xCircleFill", 146, "xCircleFill", null, 2, null);
    public static final Icon winLaurelFill = new Icon("winLaurelFill", 147, "winLaurelFill", null, 2, null);
    public static final Icon asteriskSF = new Icon("asteriskSF", 148, "asteriskSF", null, 2, null);
    public static final Icon membershipSF = new Icon("membershipSF", 149, "membershipSF", null, 2, null);
    public static final Icon reportSF = new Icon("reportSF", 150, "reportSF", null, 2, null);
    public static final Icon copySF = new Icon("copySF", 151, "copySF", null, 2, null);
    public static final Icon playButtonSF = new Icon("playButtonSF", 152, "playButtonSF", null, 2, null);
    public static final Icon walletSF = new Icon("walletSF", 153, "walletSF", null, 2, null);
    public static final Icon usernameSF = new Icon("usernameSF", 154, "usernameSF", null, 2, null);
    public static final Icon gameSF = new Icon("gameSF", 155, "gameSF", null, 2, null);
    public static final Icon wagerSF = new Icon("wagerSF", 156, "wagerSF", null, 2, null);
    public static final Icon timerSF = new Icon("timerSF", 157, "timerSF", null, 2, null);
    public static final Icon checkmarkSF = new Icon("checkmarkSF", 158, "checkmarkSF", null, 2, null);
    public static final Icon xmarkSF = new Icon("xmarkSF", 159, "xmarkSF", null, 2, null);
    public static final Icon plus = new Icon("plus", 160, "plus", null, 2, null);
    public static final Icon gear = new Icon("gear", 161, "gear", null, 2, null);
    public static final Icon play = new Icon("play", 162, "play", null, 2, null);
    public static final Icon questionCircleSF = new Icon("questionCircleSF", 163, "questionCircleSF", null, 2, null);
    public static final Icon giftSF = new Icon("giftSF", 164, "giftSF", null, 2, null);
    public static final Icon bookmarkSF = new Icon("bookmarkSF", 165, "bookmarkSF", null, 2, null);
    public static final Icon bookmarkFillSF = new Icon("bookmarkFillSF", 166, "bookmarkFillSF", null, 2, null);
    public static final Icon commentSF = new Icon("commentSF", 167, "commentSF", null, 2, null);
    public static final Icon tradeSF = new Icon("tradeSF", 168, "tradeSF", null, 2, null);
    public static final Icon locationSF = new Icon("locationSF", 169, "locationSF", null, 2, null);
    public static final Icon imageGeoblock = new Icon("imageGeoblock", 170, "imageGeoblock", null, 2, null);
    public static final Icon imageVpn = new Icon("imageVpn", 171, "imageVpn", null, 2, null);
    public static final Icon imageNoMarket = new Icon("imageNoMarket", 172, "imageNoMarket", null, 2, null);
    public static final Icon imageNoDeposit = new Icon("imageNoDeposit", 173, "imageNoDeposit", null, 2, null);
    public static final Icon ellipsis = new Icon("ellipsis", 174, "ellipsis", null, 2, null);
    public static final Icon heart = new Icon("heart", 175, "heart", null, 2, null);
    public static final Icon heartFill = new Icon("heartFill", 176, "heartFill", null, 2, null);
    public static final Icon heartSF = new Icon("heartSF", 177, "heartSF", null, 2, null);
    public static final Icon reply = new Icon("reply", 178, "reply", null, 2, null);
    public static final Icon clock = new Icon("clock", 179, "clock", null, 2, null);
    public static final Icon clockFull = new Icon("clockFull", BlurConstants.H_BD, "clockFull", null, 2, null);
    public static final Icon oddsPercentage = new Icon("oddsPercentage", 181, "oddsPercentage", null, 2, null);
    public static final Icon oddsAmerican = new Icon("oddsAmerican", 182, "oddsAmerican", null, 2, null);
    public static final Icon oddsPrice = new Icon("oddsPrice", 183, "oddsPrice", null, 2, null);
    public static final Icon football = new Icon("football", 184, "football", null, 2, null);
    public static final Icon baseballBat = new Icon("baseballBat", ModuleDescriptor.MODULE_VERSION, "baseballBat", null, 2, null);
    public static final Icon imageCoins = new Icon("imageCoins", 186, "imageCoins", null, 2, null);
    public static final Icon imageCone = new Icon("imageCone", 187, "imageCone", null, 2, null);
    public static final Icon imageSuspended = new Icon("imageSuspended", 188, "imageSuspended", null, 2, null);
    public static final Icon imageFolder = new Icon("imageFolder", 189, "imageFolder", null, 2, null);
    public static final Icon imageLogin = new Icon("imageLogin", 190, "imageLogin", null, 2, null);
    public static final Icon imageBell = new Icon("imageBell", 191, "imageBell", null, 2, null);
    public static final Icon imageTicket = new Icon("imageTicket", 192, "imageTicket", null, 2, null);
    public static final Icon imageSelfieFilter = new Icon("imageSelfieFilter", 193, "imageSelfieFilter", null, 2, null);
    public static final Icon imageCheckmark = new Icon("imageCheckmark", 194, "imageCheckmark", null, 2, null);
    public static final Icon imageChatEmptyIllo = new Icon("imageChatEmptyIllo", 195, "imageChatEmptyIllo", null, 2, null);
    public static final Icon imageEventEmptyIllo = new Icon("imageEventEmptyIllo", 196, "imageEventEmptyIllo", null, 2, null);
    public static final Icon imageStopclock = new Icon("imageStopclock", 197, "imageStopclock", null, 2, null);
    public static final Icon imageDepositIllo = new Icon("imageDepositIllo", 198, "imageDepositIllo", null, 2, null);
    public static final Icon imageCashLock = new Icon("imageCashLock", 199, "imageCashLock", null, 2, null);
    public static final Icon polymarketEmployeeBadge = new Icon("polymarketEmployeeBadge", 200, "polymarketEmployeeBadge", null, 2, null);
    public static final Icon flameFill = new Icon("flameFill", MlKitException.CODE_SCANNER_CANCELLED, "flameFill", null, 2, null);
    public static final Icon flame = new Icon("flame", MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, "flame", null, 2, null);
    public static final Icon flameCheck = new Icon("flameCheck", MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, "flameCheck", null, 2, null);
    public static final Icon shieldWarning = new Icon("shieldWarning", MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "shieldWarning", null, 2, null);
    public static final Icon exclamation = new Icon("exclamation", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "exclamation", null, 2, null);
    public static final Icon key = new Icon("key", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, "key", null, 2, null);
    public static final Icon comingSoon = new Icon("comingSoon", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, "comingSoon", null, 2, null);
    public static final Icon verified = new Icon("verified", 208, "verified", null, 2, null);
    public static final Icon mutedIcon = new Icon("mutedIcon", 209, "mutedIcon", null, 2, null);
    public static final Icon plusIcon = new Icon("plusIcon", 210, "plusIcon", null, 2, null);
    public static final Icon sendIcon = new Icon("sendIcon", 211, "sendIcon", null, 2, null);
    public static final Icon circleQuestion = new Icon("circleQuestion", 212, "circleQuestion", null, 2, null);
    public static final Icon circleQuestionFilled = new Icon("circleQuestionFilled", 213, "circleQuestionFilled", null, 2, null);
    public static final Icon userPlusFilled = new Icon("userPlusFilled", 214, "userPlusFilled", null, 2, null);
    public static final Icon xmarkSmall = new Icon("xmarkSmall", 215, "xmarkSmall", null, 2, null);

    private static final /* synthetic */ Icon[] $values() {
        return new Icon[]{chessLogo, animatedChessBackground, polymarketLogoOnly, polymarketLogoGlyph, polymarketLogoTextOnly, backButton, homeBold, searchBold, searchInputBold, inboxBold, settingBold, editIcon, caretDownBold, caretLeftBold, caretRightBold, caretUp, caretDown, caretUpDownBold, chevronReduceY, chevronExpandY, expand, doubleChevronRight, xBold, discordBold, barChartBold, lineChartBold, planeBold, moreVerticalBold, bellBold, folderTransferBold, moonBold, moonStarsBold, touchBold, shieldBold, usersBold, sunBold, clipboardBold, closeBold, clearBold, xLogoBold, boxBold, chevronDownBold, chevronRightBold, chevronUpBold, chatIconBold, listMenu, chevronUpBold2, trash, copy, warning, checkBold, infoBold, externalLinkBold, sortBold, awardBold, lightningBold, marketBold, userCircleBold, userBold, userFill, userOutline, explore, exploreFilled, liveNav, searchNav, tabGroups, tabGroupsFilled, muteFilled, mutedFilled, nicknameFilled, mention, deleteFilled, qrCode, calBold, codeBold, pinBold, chatPinIcon, profileFrame, currencyCircleBold, dollarBold, dollarUnavailableBold, arrowDiagonalBold, logoutBold, creditCardBold, bankBold, notificationsBold, arrowLineUpBold, arrowLineDownBold, arrowUp, lockBold, lockFill, faceID, tapBold, transferBold, chatBold, phoneBold, idCardBold, waveBold, mailBold, stadium, bookBold, recenterBold, lineLimitBold, taxDocumentsBold, documentBold, filterBold, stackBold, ticketBold, speedometerBold, pendingClockBold, hourglassBold, dollarCircleBold, wallet, quickSwitcher, gridMode, liveChart, refresh, cardVisa, cardMastercard, cardAmex, cardDiscover, cardJcb, cardDiners, cardMaestro, cardMada, apple, appleBold, google, paypal, venmo, instaBold, homeFill, searchFill, inboxFill, settingFill, crownFill, userCircleFill, notificationsFill, infoFill, plusFill, checkCircleFill, ticketFill, ticketOutline, tieFill, equalArrows, cashOutBold, xCircleFill, winLaurelFill, asteriskSF, membershipSF, reportSF, copySF, playButtonSF, walletSF, usernameSF, gameSF, wagerSF, timerSF, checkmarkSF, xmarkSF, plus, gear, play, questionCircleSF, giftSF, bookmarkSF, bookmarkFillSF, commentSF, tradeSF, locationSF, imageGeoblock, imageVpn, imageNoMarket, imageNoDeposit, ellipsis, heart, heartFill, heartSF, reply, clock, clockFull, oddsPercentage, oddsAmerican, oddsPrice, football, baseballBat, imageCoins, imageCone, imageSuspended, imageFolder, imageLogin, imageBell, imageTicket, imageSelfieFilter, imageCheckmark, imageChatEmptyIllo, imageEventEmptyIllo, imageStopclock, imageDepositIllo, imageCashLock, polymarketEmployeeBadge, flameFill, flame, flameCheck, shieldWarning, exclamation, key, comingSoon, verified, mutedIcon, plusIcon, sendIcon, circleQuestion, circleQuestionFilled, userPlusFilled, xmarkSmall};
    }

    static {
        Icon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ Icon(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Icon valueOf(String str) {
        return (Icon) Enum.valueOf(Icon.class, str);
    }

    public static Icon[] values() {
        return (Icon[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0003'()B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J!\u0010\u001c\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "size", "Lcom/polymarket/designtokens/Icon$Metadata$Size;", "contentMode", "Lcom/polymarket/designtokens/Icon$Metadata$ContentMode;", "(Lcom/polymarket/designtokens/Icon$Metadata$Size;Lcom/polymarket/designtokens/Icon$Metadata$ContentMode;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "getSize", "()Lcom/polymarket/designtokens/Icon$Metadata$Size;", "Swift_size", "getContentMode", "()Lcom/polymarket/designtokens/Icon$Metadata$ContentMode;", "Swift_contentMode", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "ContentMode", "Size", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Metadata implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata$ContentMode;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "fit", "fill", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentMode implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ ContentMode[] $VALUES;
            public static final ContentMode fit = new ContentMode("fit", 0);
            public static final ContentMode fill = new ContentMode("fill", 1);

            private static final /* synthetic */ ContentMode[] $values() {
                return new ContentMode[]{fit, fill};
            }

            static {
                ContentMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private ContentMode(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static ContentMode valueOf(String str) {
                return (ContentMode) Enum.valueOf(ContentMode.class, str);
            }

            public static ContentMode[] values() {
                return (ContentMode[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        public Metadata(Size size, ContentMode contentMode) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(size, contentMode);
        }

        private final native long Swift_constructor_0(Size size, ContentMode contentMode);

        private final native ContentMode Swift_contentMode(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Size Swift_size(long Swift_peer);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public boolean equals(Object other) {
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final ContentMode getContentMode() {
            return Swift_contentMode(this.Swift_peer);
        }

        public final Size getSize() {
            return Swift_size(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata$Size;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "FixedCase", "FlexibleCase", "FlexibleSize", "Companion", "Lcom/polymarket/designtokens/Icon$Metadata$Size$FixedCase;", "Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleCase;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static abstract class Size implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata$Size$FixedCase;", "Lcom/polymarket/designtokens/Icon$Metadata$Size;", "associated0", "", "associated1", "<init>", "(DD)V", "getAssociated0", "()D", "getAssociated1", "width", "getWidth", "height", "getHeight", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class FixedCase extends Size {
                private final double associated0;
                private final double associated1;
                private final double height;
                private final double width;

                public FixedCase(double d, double d2) {
                    super(null);
                    this.associated0 = d;
                    this.associated1 = d2;
                    this.width = d;
                    this.height = d2;
                }

                public final double getAssociated0() {
                    return this.associated0;
                }

                public final double getAssociated1() {
                    return this.associated1;
                }

                public final double getHeight() {
                    return this.height;
                }

                public final double getWidth() {
                    return this.width;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleCase;", "Lcom/polymarket/designtokens/Icon$Metadata$Size;", "associated0", "Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleSize;", "<init>", "(Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleSize;)V", "getAssociated0", "()Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleSize;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class FlexibleCase extends Size {
                private final FlexibleSize associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FlexibleCase(FlexibleSize flexibleSize) {
                    super(null);
                    flexibleSize.getClass();
                    this.associated0 = flexibleSize;
                }

                public final FlexibleSize getAssociated0() {
                    return this.associated0;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleSize;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "extraExtraSmall", "extraSmall", "small", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "large", "extraLarge", "extraExtraLarge", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class FlexibleSize implements SwiftProjecting {
                private static final /* synthetic */ ug7 $ENTRIES;
                private static final /* synthetic */ FlexibleSize[] $VALUES;
                public static final FlexibleSize extraExtraSmall = new FlexibleSize("extraExtraSmall", 0);
                public static final FlexibleSize extraSmall = new FlexibleSize("extraSmall", 1);
                public static final FlexibleSize small = new FlexibleSize("small", 2);
                public static final FlexibleSize medium = new FlexibleSize(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 3);
                public static final FlexibleSize large = new FlexibleSize("large", 4);
                public static final FlexibleSize extraLarge = new FlexibleSize("extraLarge", 5);
                public static final FlexibleSize extraExtraLarge = new FlexibleSize("extraExtraLarge", 6);

                private static final /* synthetic */ FlexibleSize[] $values() {
                    return new FlexibleSize[]{extraExtraSmall, extraSmall, small, medium, large, extraLarge, extraExtraLarge};
                }

                static {
                    FlexibleSize[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = ww4.b($values);
                    INSTANCE = new Companion(null);
                }

                private FlexibleSize(String str, int i) {
                }

                private final native Function0<Object> Swift_projectionImpl(int options);

                public static ug7 getEntries() {
                    return $ENTRIES;
                }

                public static FlexibleSize valueOf(String str) {
                    return (FlexibleSize) Enum.valueOf(FlexibleSize.class, str);
                }

                public static FlexibleSize[] values() {
                    return (FlexibleSize[]) $VALUES.clone();
                }

                @Override // skip.lib.SwiftProjecting
                public Function0<Object> Swift_projection(int options) {
                    return Swift_projectionImpl(options);
                }
            }

            public /* synthetic */ Size(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/designtokens/Icon$Metadata$Size$Companion;", "", "<init>", "()V", "fixed", "Lcom/polymarket/designtokens/Icon$Metadata$Size;", "width", "", "height", "flexible", "associated0", "Lcom/polymarket/designtokens/Icon$Metadata$Size$FlexibleSize;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Size fixed(double width, double height) {
                    return new FixedCase(width, height);
                }

                public final Size flexible(FlexibleSize associated0) {
                    associated0.getClass();
                    return new FlexibleCase(associated0);
                }

                private Companion() {
                }
            }

            private Size() {
            }
        }

        public Metadata(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/designtokens/Icon$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/designtokens/Icon;", "rawValue", "", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Icon init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -2144044784:
                    if (!rawValue.equals("transferBold")) {
                        return null;
                    }
                    return Icon.transferBold;
                case -2139751444:
                    if (rawValue.equals("bookmarkFillSF")) {
                        return Icon.bookmarkFillSF;
                    }
                    return null;
                case -2101587897:
                    if (rawValue.equals("imageTicket")) {
                        return Icon.imageTicket;
                    }
                    return null;
                case -2094664449:
                    if (rawValue.equals("appleBold")) {
                        return Icon.appleBold;
                    }
                    return null;
                case -2084893653:
                    if (rawValue.equals("animatedChessBackground")) {
                        return Icon.animatedChessBackground;
                    }
                    return null;
                case -2039973535:
                    if (rawValue.equals("dollarBold")) {
                        return Icon.dollarBold;
                    }
                    return null;
                case -1994383672:
                    if (rawValue.equals("verified")) {
                        return Icon.verified;
                    }
                    return null;
                case -1955047336:
                    if (rawValue.equals("xmarkSF")) {
                        return Icon.xmarkSF;
                    }
                    return null;
                case -1947552343:
                    if (rawValue.equals("usernameSF")) {
                        return Icon.usernameSF;
                    }
                    return null;
                case -1897612291:
                    if (rawValue.equals(PlaceTypes.STADIUM)) {
                        return Icon.stadium;
                    }
                    return null;
                case -1859635487:
                    if (rawValue.equals("bankBold")) {
                        return Icon.bankBold;
                    }
                    return null;
                case -1857984783:
                    if (rawValue.equals("sunBold")) {
                        return Icon.sunBold;
                    }
                    return null;
                case -1849583043:
                    if (rawValue.equals("plusFill")) {
                        return Icon.plusFill;
                    }
                    return null;
                case -1849499341:
                    if (rawValue.equals("plusIcon")) {
                        return Icon.plusIcon;
                    }
                    return null;
                case -1808816039:
                    if (rawValue.equals("playButtonSF")) {
                        return Icon.playButtonSF;
                    }
                    return null;
                case -1701115133:
                    if (rawValue.equals("arrowDiagonalBold")) {
                        return Icon.arrowDiagonalBold;
                    }
                    return null;
                case -1666191466:
                    if (rawValue.equals("ticketOutline")) {
                        return Icon.ticketOutline;
                    }
                    return null;
                case -1554935923:
                    if (rawValue.equals("notificationsBold")) {
                        return Icon.notificationsBold;
                    }
                    return null;
                case -1554822517:
                    if (rawValue.equals("notificationsFill")) {
                        return Icon.notificationsFill;
                    }
                    return null;
                case -1553596899:
                    if (rawValue.equals("filterBold")) {
                        return Icon.filterBold;
                    }
                    return null;
                case -1541217080:
                    if (rawValue.equals("tapBold")) {
                        return Icon.tapBold;
                    }
                    return null;
                case -1495016206:
                    if (rawValue.equals("commentSF")) {
                        return Icon.commentSF;
                    }
                    return null;
                case -1473742272:
                    if (rawValue.equals("documentBold")) {
                        return Icon.documentBold;
                    }
                    return null;
                case -1468781721:
                    if (rawValue.equals("imageCoins")) {
                        return Icon.imageCoins;
                    }
                    return null;
                case -1460472114:
                    if (rawValue.equals("imageLogin")) {
                        return Icon.imageLogin;
                    }
                    return null;
                case -1458412519:
                    if (rawValue.equals("polymarketLogoGlyph")) {
                        return Icon.polymarketLogoGlyph;
                    }
                    return null;
                case -1408112137:
                    if (rawValue.equals("userOutline")) {
                        return Icon.userOutline;
                    }
                    return null;
                case -1360331138:
                    if (rawValue.equals("caretRightBold")) {
                        return Icon.caretRightBold;
                    }
                    return null;
                case -1354715000:
                    if (rawValue.equals("copySF")) {
                        return Icon.copySF;
                    }
                    return null;
                case -1350397623:
                    if (rawValue.equals("imageDepositIllo")) {
                        return Icon.imageDepositIllo;
                    }
                    return null;
                case -1322229197:
                    if (rawValue.equals("tieFill")) {
                        return Icon.tieFill;
                    }
                    return null;
                case -1322219690:
                    if (rawValue.equals("flameFill")) {
                        return Icon.flameFill;
                    }
                    return null;
                case -1319738510:
                    if (rawValue.equals("taxDocumentsBold")) {
                        return Icon.taxDocumentsBold;
                    }
                    return null;
                case -1313909672:
                    if (rawValue.equals("timerSF")) {
                        return Icon.timerSF;
                    }
                    return null;
                case -1309148525:
                    if (rawValue.equals("explore")) {
                        return Icon.explore;
                    }
                    return null;
                case -1295149500:
                    if (rawValue.equals("chevronExpandY")) {
                        return Icon.chevronExpandY;
                    }
                    return null;
                case -1289167206:
                    if (rawValue.equals("expand")) {
                        return Icon.expand;
                    }
                    return null;
                case -1282163656:
                    if (rawValue.equals("faceID")) {
                        return Icon.faceID;
                    }
                    return null;
                case -1271711223:
                    if (rawValue.equals("bookmarkSF")) {
                        return Icon.bookmarkSF;
                    }
                    return null;
                case -1271433614:
                    if (rawValue.equals("clearBold")) {
                        return Icon.clearBold;
                    }
                    return null;
                case -1253236283:
                    if (rawValue.equals("gameSF")) {
                        return Icon.gameSF;
                    }
                    return null;
                case -1246042237:
                    if (rawValue.equals("giftSF")) {
                        return Icon.giftSF;
                    }
                    return null;
                case -1240244679:
                    if (rawValue.equals("google")) {
                        return Icon.google;
                    }
                    return null;
                case -1219583216:
                    if (rawValue.equals("moreVerticalBold")) {
                        return Icon.moreVerticalBold;
                    }
                    return null;
                case -1142557971:
                    if (rawValue.equals("deleteFilled")) {
                        return Icon.deleteFilled;
                    }
                    return null;
                case -1105318615:
                    if (rawValue.equals("questionCircleSF")) {
                        return Icon.questionCircleSF;
                    }
                    return null;
                case -1092640169:
                    if (rawValue.equals("imageGeoblock")) {
                        return Icon.imageGeoblock;
                    }
                    return null;
                case -1067371849:
                    if (rawValue.equals("tradeSF")) {
                        return Icon.tradeSF;
                    }
                    return null;
                case -1029536493:
                    if (rawValue.equals("phoneBold")) {
                        return Icon.phoneBold;
                    }
                    return null;
                case -995205389:
                    if (rawValue.equals("paypal")) {
                        return Icon.paypal;
                    }
                    return null;
                case -952485970:
                    if (rawValue.equals("qrCode")) {
                        return Icon.qrCode;
                    }
                    return null;
                case -935412803:
                    if (rawValue.equals("clockFull")) {
                        return Icon.clockFull;
                    }
                    return null;
                case -878703362:
                    if (rawValue.equals("imageBell")) {
                        return Icon.imageBell;
                    }
                    return null;
                case -878663906:
                    if (rawValue.equals("imageCone")) {
                        return Icon.imageCone;
                    }
                    return null;
                case -868508142:
                    if (rawValue.equals("codeBold")) {
                        return Icon.codeBold;
                    }
                    return null;
                case -859609703:
                    if (rawValue.equals("imageVpn")) {
                        return Icon.imageVpn;
                    }
                    return null;
                case -822178030:
                    if (rawValue.equals("doubleChevronRight")) {
                        return Icon.doubleChevronRight;
                    }
                    return null;
                case -801760811:
                    if (rawValue.equals("exploreFilled")) {
                        return Icon.exploreFilled;
                    }
                    return null;
                case -795192327:
                    if (rawValue.equals("wallet")) {
                        return Icon.wallet;
                    }
                    return null;
                case -765368899:
                    if (rawValue.equals("arrowLineUpBold")) {
                        return Icon.arrowLineUpBold;
                    }
                    return null;
                case -755779728:
                    if (rawValue.equals("nicknameFilled")) {
                        return Icon.nicknameFilled;
                    }
                    return null;
                case -734027644:
                    if (rawValue.equals("arrowUp")) {
                        return Icon.arrowUp;
                    }
                    return null;
                case -710999987:
                    if (rawValue.equals("searchBold")) {
                        return Icon.searchBold;
                    }
                    return null;
                case -710886581:
                    if (rawValue.equals("searchFill")) {
                        return Icon.searchFill;
                    }
                    return null;
                case -685218106:
                    if (rawValue.equals("chevronRightBold")) {
                        return Icon.chevronRightBold;
                    }
                    return null;
                case -633047599:
                    if (rawValue.equals("discordBold")) {
                        return Icon.discordBold;
                    }
                    return null;
                case -600995041:
                    if (rawValue.equals("polymarketLogoOnly")) {
                        return Icon.polymarketLogoOnly;
                    }
                    return null;
                case -569078342:
                    if (rawValue.equals("pinBold")) {
                        return Icon.pinBold;
                    }
                    return null;
                case -499257553:
                    if (rawValue.equals("logoutBold")) {
                        return Icon.logoutBold;
                    }
                    return null;
                case -486728700:
                    if (rawValue.equals("homeBold")) {
                        return Icon.homeBold;
                    }
                    return null;
                case -486615294:
                    if (rawValue.equals("homeFill")) {
                        return Icon.homeFill;
                    }
                    return null;
                case -483012451:
                    if (rawValue.equals("closeBold")) {
                        return Icon.closeBold;
                    }
                    return null;
                case -470454971:
                    if (rawValue.equals("asteriskSF")) {
                        return Icon.asteriskSF;
                    }
                    return null;
                case -439618452:
                    if (rawValue.equals("polymarketLogoTextOnly")) {
                        return Icon.polymarketLogoTextOnly;
                    }
                    return null;
                case -427040121:
                    if (rawValue.equals("reportSF")) {
                        return Icon.reportSF;
                    }
                    return null;
                case -356890208:
                    if (rawValue.equals("userCircleBold")) {
                        return Icon.userCircleBold;
                    }
                    return null;
                case -356776802:
                    if (rawValue.equals("userCircleFill")) {
                        return Icon.userCircleFill;
                    }
                    return null;
                case -297041626:
                    if (rawValue.equals("moonBold")) {
                        return Icon.moonBold;
                    }
                    return null;
                case -267010832:
                    if (rawValue.equals("userBold")) {
                        return Icon.userBold;
                    }
                    return null;
                case -266897426:
                    if (rawValue.equals("userFill")) {
                        return Icon.userFill;
                    }
                    return null;
                case -251092553:
                    if (rawValue.equals("chevronUpBold2")) {
                        return Icon.chevronUpBold2;
                    }
                    return null;
                case -198441275:
                    if (rawValue.equals("caretDown")) {
                        return Icon.caretDown;
                    }
                    return null;
                case -196217670:
                    if (rawValue.equals("imageCheckmark")) {
                        return Icon.imageCheckmark;
                    }
                    return null;
                case -163469145:
                    if (rawValue.equals("searchInputBold")) {
                        return Icon.searchInputBold;
                    }
                    return null;
                case -133395985:
                    if (rawValue.equals("lineChartBold")) {
                        return Icon.lineChartBold;
                    }
                    return null;
                case -122743563:
                    if (rawValue.equals("settingBold")) {
                        return Icon.settingBold;
                    }
                    return null;
                case -122630157:
                    if (rawValue.equals("settingFill")) {
                        return Icon.settingFill;
                    }
                    return null;
                case -83365712:
                    if (rawValue.equals("barChartBold")) {
                        return Icon.barChartBold;
                    }
                    return null;
                case -54520984:
                    if (rawValue.equals("xLogoBold")) {
                        return Icon.xLogoBold;
                    }
                    return null;
                case -15428348:
                    if (rawValue.equals("arrowLineDownBold")) {
                        return Icon.arrowLineDownBold;
                    }
                    return null;
                case -10813220:
                    if (rawValue.equals("mailBold")) {
                        return Icon.mailBold;
                    }
                    return null;
                case -8805105:
                    if (rawValue.equals("cardAmex")) {
                        return Icon.cardAmex;
                    }
                    return null;
                case -8459199:
                    if (rawValue.equals("cardMada")) {
                        return Icon.cardMada;
                    }
                    return null;
                case -8182927:
                    if (rawValue.equals("cardVisa")) {
                        return Icon.cardVisa;
                    }
                    return null;
                case -3611381:
                    if (rawValue.equals("xCircleFill")) {
                        return Icon.xCircleFill;
                    }
                    return null;
                case 106079:
                    if (rawValue.equals("key")) {
                        return Icon.key;
                    }
                    return null;
                case 3059573:
                    if (rawValue.equals("copy")) {
                        return Icon.copy;
                    }
                    return null;
                case 3168655:
                    if (rawValue.equals("gear")) {
                        return Icon.gear;
                    }
                    return null;
                case 3443508:
                    if (rawValue.equals("play")) {
                        return Icon.play;
                    }
                    return null;
                case 3444122:
                    if (rawValue.equals("plus")) {
                        return Icon.plus;
                    }
                    return null;
                case 27798528:
                    if (rawValue.equals("instaBold")) {
                        return Icon.instaBold;
                    }
                    return null;
                case 29673292:
                    if (rawValue.equals("lineLimitBold")) {
                        return Icon.lineLimitBold;
                    }
                    return null;
                case 71782128:
                    if (rawValue.equals("boxBold")) {
                        return Icon.boxBold;
                    }
                    return null;
                case 92558747:
                    if (rawValue.equals("checkCircleFill")) {
                        return Icon.checkCircleFill;
                    }
                    return null;
                case 93029210:
                    if (rawValue.equals("apple")) {
                        return Icon.apple;
                    }
                    return null;
                case 94755854:
                    if (rawValue.equals("clock")) {
                        return Icon.clock;
                    }
                    return null;
                case 97513267:
                    if (rawValue.equals("flame")) {
                        return Icon.flame;
                    }
                    return null;
                case 99151942:
                    if (rawValue.equals("heart")) {
                        return Icon.heart;
                    }
                    return null;
                case 108401386:
                    if (rawValue.equals("reply")) {
                        return Icon.reply;
                    }
                    return null;
                case 110621496:
                    if (rawValue.equals("trash")) {
                        return Icon.trash;
                    }
                    return null;
                case 112093569:
                    if (rawValue.equals("venmo")) {
                        return Icon.venmo;
                    }
                    return null;
                case 112898845:
                    if (rawValue.equals("xBold")) {
                        return Icon.xBold;
                    }
                    return null;
                case 121258972:
                    if (rawValue.equals("pendingClockBold")) {
                        return Icon.pendingClockBold;
                    }
                    return null;
                case 177409107:
                    if (rawValue.equals("infoBold")) {
                        return Icon.infoBold;
                    }
                    return null;
                case 177522513:
                    if (rawValue.equals("infoFill")) {
                        return Icon.infoFill;
                    }
                    return null;
                case 184273047:
                    if (rawValue.equals("liveNav")) {
                        return Icon.liveNav;
                    }
                    return null;
                case 188702929:
                    if (rawValue.equals("ellipsis")) {
                        return Icon.ellipsis;
                    }
                    return null;
                case 200066793:
                    if (rawValue.equals("heartFill")) {
                        return Icon.heartFill;
                    }
                    return null;
                case 210675565:
                    if (rawValue.equals("cardDiners")) {
                        return Icon.cardDiners;
                    }
                    return null;
                case 222832150:
                    if (rawValue.equals("chatIconBold")) {
                        return Icon.chatIconBold;
                    }
                    return null;
                case 231133499:
                    if (rawValue.equals("clipboardBold")) {
                        return Icon.clipboardBold;
                    }
                    return null;
                case 297903525:
                    if (rawValue.equals("baseballBat")) {
                        return Icon.baseballBat;
                    }
                    return null;
                case 317859337:
                    if (rawValue.equals("gridMode")) {
                        return Icon.gridMode;
                    }
                    return null;
                case 324355084:
                    if (rawValue.equals("walletSF")) {
                        return Icon.walletSF;
                    }
                    return null;
                case 330478656:
                    if (rawValue.equals("cashOutBold")) {
                        return Icon.cashOutBold;
                    }
                    return null;
                case 356513965:
                    if (rawValue.equals("usersBold")) {
                        return Icon.usersBold;
                    }
                    return null;
                case 363255396:
                    if (rawValue.equals("touchBold")) {
                        return Icon.touchBold;
                    }
                    return null;
                case 394668909:
                    if (rawValue.equals("football")) {
                        return Icon.football;
                    }
                    return null;
                case 398053293:
                    if (rawValue.equals("checkBold")) {
                        return Icon.checkBold;
                    }
                    return null;
                case 407542235:
                    if (rawValue.equals("chevronUpBold")) {
                        return Icon.chevronUpBold;
                    }
                    return null;
                case 517665961:
                    if (rawValue.equals("membershipSF")) {
                        return Icon.membershipSF;
                    }
                    return null;
                case 533683556:
                    if (rawValue.equals("oddsAmerican")) {
                        return Icon.oddsAmerican;
                    }
                    return null;
                case 539969520:
                    if (rawValue.equals("idCardBold")) {
                        return Icon.idCardBold;
                    }
                    return null;
                case 547395443:
                    if (rawValue.equals("calBold")) {
                        return Icon.calBold;
                    }
                    return null;
                case 553913625:
                    if (rawValue.equals("cardJcb")) {
                        return Icon.cardJcb;
                    }
                    return null;
                case 553983358:
                    if (rawValue.equals("caretUp")) {
                        return Icon.caretUp;
                    }
                    return null;
                case 603135262:
                    if (rawValue.equals("waveBold")) {
                        return Icon.waveBold;
                    }
                    return null;
                case 637544398:
                    if (rawValue.equals("creditCardBold")) {
                        return Icon.creditCardBold;
                    }
                    return null;
                case 736970521:
                    if (rawValue.equals("cardDiscover")) {
                        return Icon.cardDiscover;
                    }
                    return null;
                case 781913510:
                    if (rawValue.equals("speedometerBold")) {
                        return Icon.speedometerBold;
                    }
                    return null;
                case 795738393:
                    if (rawValue.equals("heartSF")) {
                        return Icon.heartSF;
                    }
                    return null;
                case 820507022:
                    if (rawValue.equals("shieldBold")) {
                        return Icon.shieldBold;
                    }
                    return null;
                case 850365551:
                    if (rawValue.equals("lightningBold")) {
                        return Icon.lightningBold;
                    }
                    return null;
                case 863805643:
                    if (rawValue.equals("chessLogo")) {
                        return Icon.chessLogo;
                    }
                    return null;
                case 886519003:
                    if (rawValue.equals("muteFilled")) {
                        return Icon.muteFilled;
                    }
                    return null;
                case 887575149:
                    if (rawValue.equals("exclamation")) {
                        return Icon.exclamation;
                    }
                    return null;
                case 950345194:
                    if (rawValue.equals("mention")) {
                        return Icon.mention;
                    }
                    return null;
                case 982772306:
                    if (rawValue.equals("liveChart")) {
                        return Icon.liveChart;
                    }
                    return null;
                case 1038045745:
                    if (rawValue.equals("imageStopclock")) {
                        return Icon.imageStopclock;
                    }
                    return null;
                case 1046063838:
                    if (rawValue.equals("oddsPercentage")) {
                        return Icon.oddsPercentage;
                    }
                    return null;
                case 1085444827:
                    if (rawValue.equals("refresh")) {
                        return Icon.refresh;
                    }
                    return null;
                case 1098012920:
                    if (rawValue.equals("chevronReduceY")) {
                        return Icon.chevronReduceY;
                    }
                    return null;
                case 1114027037:
                    if (rawValue.equals("wagerSF")) {
                        return Icon.wagerSF;
                    }
                    return null;
                case 1116718305:
                    if (rawValue.equals("marketBold")) {
                        return Icon.marketBold;
                    }
                    return null;
                case 1124446108:
                    if (rawValue.equals("warning")) {
                        return Icon.warning;
                    }
                    return null;
                case 1163719812:
                    if (rawValue.equals("mutedIcon")) {
                        return Icon.mutedIcon;
                    }
                    return null;
                case 1200738628:
                    if (rawValue.equals("profileFrame")) {
                        return Icon.profileFrame;
                    }
                    return null;
                case 1237572802:
                    if (rawValue.equals("xmarkSmall")) {
                        return Icon.xmarkSmall;
                    }
                    return null;
                case 1247116321:
                    if (rawValue.equals("sendIcon")) {
                        return Icon.sendIcon;
                    }
                    return null;
                case 1258271362:
                    if (rawValue.equals("awardBold")) {
                        return Icon.awardBold;
                    }
                    return null;
                case 1259979209:
                    if (rawValue.equals("tabGroups")) {
                        return Icon.tabGroups;
                    }
                    return null;
                case 1277781922:
                    if (rawValue.equals("cardMastercard")) {
                        return Icon.cardMastercard;
                    }
                    return null;
                case 1301943278:
                    if (rawValue.equals("quickSwitcher")) {
                        return Icon.quickSwitcher;
                    }
                    return null;
                case 1345436445:
                    if (rawValue.equals("listMenu")) {
                        return Icon.listMenu;
                    }
                    return null;
                case 1349181061:
                    if (rawValue.equals("oddsPrice")) {
                        return Icon.oddsPrice;
                    }
                    return null;
                case 1390110073:
                    if (rawValue.equals("imageCashLock")) {
                        return Icon.imageCashLock;
                    }
                    return null;
                case 1396647935:
                    if (rawValue.equals("cardMaestro")) {
                        return Icon.cardMaestro;
                    }
                    return null;
                case 1401790774:
                    if (rawValue.equals("chatPinIcon")) {
                        return Icon.chatPinIcon;
                    }
                    return null;
                case 1421660615:
                    if (rawValue.equals("userPlusFilled")) {
                        return Icon.userPlusFilled;
                    }
                    return null;
                case 1436866045:
                    if (rawValue.equals("chatBold")) {
                        return Icon.chatBold;
                    }
                    return null;
                case 1464531821:
                    if (rawValue.equals("polymarketEmployeeBadge")) {
                        return Icon.polymarketEmployeeBadge;
                    }
                    return null;
                case 1495437544:
                    if (rawValue.equals("checkmarkSF")) {
                        return Icon.checkmarkSF;
                    }
                    return null;
                case 1506856666:
                    if (rawValue.equals("crownFill")) {
                        return Icon.crownFill;
                    }
                    return null;
                case 1541837000:
                    if (rawValue.equals("locationSF")) {
                        return Icon.locationSF;
                    }
                    return null;
                case 1550492290:
                    if (rawValue.equals("imageNoDeposit")) {
                        return Icon.imageNoDeposit;
                    }
                    return null;
                case 1562807981:
                    if (rawValue.equals("mutedFilled")) {
                        return Icon.mutedFilled;
                    }
                    return null;
                case 1571867370:
                    if (rawValue.equals("caretDownBold")) {
                        return Icon.caretDownBold;
                    }
                    return null;
                case 1588240010:
                    if (rawValue.equals("externalLinkBold")) {
                        return Icon.externalLinkBold;
                    }
                    return null;
                case 1596511717:
                    if (rawValue.equals("caretUpDownBold")) {
                        return Icon.caretUpDownBold;
                    }
                    return null;
                case 1601702307:
                    if (rawValue.equals("editIcon")) {
                        return Icon.editIcon;
                    }
                    return null;
                case 1626407613:
                    if (rawValue.equals("hourglassBold")) {
                        return Icon.hourglassBold;
                    }
                    return null;
                case 1634044456:
                    if (rawValue.equals("bellBold")) {
                        return Icon.bellBold;
                    }
                    return null;
                case 1651375769:
                    if (rawValue.equals("dollarUnavailableBold")) {
                        return Icon.dollarUnavailableBold;
                    }
                    return null;
                case 1660555397:
                    if (rawValue.equals("moonStarsBold")) {
                        return Icon.moonStarsBold;
                    }
                    return null;
                case 1661314371:
                    if (rawValue.equals("sortBold")) {
                        return Icon.sortBold;
                    }
                    return null;
                case 1727393069:
                    if (rawValue.equals("stackBold")) {
                        return Icon.stackBold;
                    }
                    return null;
                case 1756376401:
                    if (rawValue.equals("dollarCircleBold")) {
                        return Icon.dollarCircleBold;
                    }
                    return null;
                case 1778190939:
                    if (rawValue.equals("searchNav")) {
                        return Icon.searchNav;
                    }
                    return null;
                case 1798373801:
                    if (rawValue.equals("imageFolder")) {
                        return Icon.imageFolder;
                    }
                    return null;
                case 1809822878:
                    if (rawValue.equals("folderTransferBold")) {
                        return Icon.folderTransferBold;
                    }
                    return null;
                case 1828060120:
                    if (rawValue.equals("imageNoMarket")) {
                        return Icon.imageNoMarket;
                    }
                    return null;
                case 1832329355:
                    if (rawValue.equals("tabGroupsFilled")) {
                        return Icon.tabGroupsFilled;
                    }
                    return null;
                case 1863191503:
                    if (rawValue.equals("caretLeftBold")) {
                        return Icon.caretLeftBold;
                    }
                    return null;
                case 1869721048:
                    if (rawValue.equals("circleQuestionFilled")) {
                        return Icon.circleQuestionFilled;
                    }
                    return null;
                case 1870739874:
                    if (rawValue.equals("chevronDownBold")) {
                        return Icon.chevronDownBold;
                    }
                    return null;
                case 1872887064:
                    if (rawValue.equals("winLaurelFill")) {
                        return Icon.winLaurelFill;
                    }
                    return null;
                case 1888514797:
                    if (rawValue.equals("recenterBold")) {
                        return Icon.recenterBold;
                    }
                    return null;
                case 1894333340:
                    if (rawValue.equals("comingSoon")) {
                        return Icon.comingSoon;
                    }
                    return null;
                case 1906413305:
                    if (rawValue.equals("backButton")) {
                        return Icon.backButton;
                    }
                    return null;
                case 1908794960:
                    if (rawValue.equals("lockBold")) {
                        return Icon.lockBold;
                    }
                    return null;
                case 1908908366:
                    if (rawValue.equals("lockFill")) {
                        return Icon.lockFill;
                    }
                    return null;
                case 1958055317:
                    if (rawValue.equals("flameCheck")) {
                        return Icon.flameCheck;
                    }
                    return null;
                case 1998200363:
                    if (rawValue.equals("inboxBold")) {
                        return Icon.inboxBold;
                    }
                    return null;
                case 1998313769:
                    if (rawValue.equals("inboxFill")) {
                        return Icon.inboxFill;
                    }
                    return null;
                case 2004110606:
                    if (rawValue.equals("bookBold")) {
                        return Icon.bookBold;
                    }
                    return null;
                case 2026252766:
                    if (rawValue.equals("equalArrows")) {
                        return Icon.equalArrows;
                    }
                    return null;
                case 2037799616:
                    if (rawValue.equals("imageSuspended")) {
                        return Icon.imageSuspended;
                    }
                    return null;
                case 2053606614:
                    if (rawValue.equals("circleQuestion")) {
                        return Icon.circleQuestion;
                    }
                    return null;
                case 2067160468:
                    if (rawValue.equals("imageEventEmptyIllo")) {
                        return Icon.imageEventEmptyIllo;
                    }
                    return null;
                case 2089006001:
                    if (rawValue.equals("ticketBold")) {
                        return Icon.ticketBold;
                    }
                    return null;
                case 2089119407:
                    if (rawValue.equals("ticketFill")) {
                        return Icon.ticketFill;
                    }
                    return null;
                case 2106200059:
                    if (rawValue.equals("imageSelfieFilter")) {
                        return Icon.imageSelfieFilter;
                    }
                    return null;
                case 2106587905:
                    if (rawValue.equals("planeBold")) {
                        return Icon.planeBold;
                    }
                    return null;
                case 2128654323:
                    if (rawValue.equals("shieldWarning")) {
                        return Icon.shieldWarning;
                    }
                    return null;
                case 2137361088:
                    if (rawValue.equals("imageChatEmptyIllo")) {
                        return Icon.imageChatEmptyIllo;
                    }
                    return null;
                case 2145594982:
                    if (rawValue.equals("currencyCircleBold")) {
                        return Icon.currencyCircleBold;
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

    private Icon(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
