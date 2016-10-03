package grails.metadata.contributor

import org.hibernate.boot.spi.InFlightMetadataCollector
import org.hibernate.boot.spi.MetadataContributor
import org.jboss.jandex.IndexView

/**
 * Created by eric on 03/10/16.
 */
class MetadataContributorImpl implements MetadataContributor {

    @Override
    void contribute(InFlightMetadataCollector metadataCollector, IndexView jandexIndex) {
        println '****************** Contribotor used ****************'
    }
}
