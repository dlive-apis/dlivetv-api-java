package cc.timedot;

public class Querys {
    static String SendStreamchatMessage = "mutation SendStreamChatMessage($input: SendStreamchatMessageInput!) { sendStreamchatMessage(input: $input) { err { code __typename } message { type ... on ChatText { id content ...VStreamChatSenderInfoFrag __typename } __typename } __typename } } fragment VStreamChatSenderInfoFrag on SenderInfo { subscribing role roomRole sender { id username displayname avatar partnerStatus __typename } __typename }";
    static String DeleteChat = "mutation DeleteChat($streamer: String!, $id: String!) { chatDelete(streamer: $streamer, id: $id) { err { code message __typename } __typename } }";
    static String FollowUser = "mutation FollowUser($streamer: String!) { follow(streamer: $streamer) { err { code message __typename } __typename } }";
    static String UnfollowUser = "mutation UnfollowUser($streamer: String!) { unfollow(streamer: $streamer) { err { code message __typename } __typename } }";
}
