//package no.nav.permitteringsmelding.notifikasjon.minsideklient.graphql
//
//import com.expediagroup.graphql.client.ktor.GraphQLKtorClient
//import io.ktor.client.*
//import io.ktor.client.engine.okhttp.*
//import io.ktor.client.features.logging.*
//import kotlinx.coroutines.runBlocking
//import java.net.URL
//
//class MinSideGraphQLKlient(val endpoint: String, val httpClient: HttpClient) {
//    fun opprettNyBeskjed(
//        virksomhetsnummer: String,
//        lenke: String,
//        eksternId: String
//    ) {
//
//        val client = GraphQLKtorClient(
//            url = URL(endpoint),
//            httpClient = httpClient
//        )
//
//        runBlocking {
//            val query = OpprettNyBeskjed(variables = OpprettNyBeskjed.Variables(
//                virksomhetsnummer,
//                eksternId,
//                lenke
//            ));
//            val resultat = client.execute(query);
//
//        }
//        return
//    }
//}