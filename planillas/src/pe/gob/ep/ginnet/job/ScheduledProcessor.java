package pe.gob.ep.ginnet.job;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("scheduledProcessor")
public class ScheduledProcessor {
	protected final Log log = LogFactory.getLog(getClass());
	
//	@Scheduled(fixedDelay = 15000)
//	public void ScheduledProcessorAudio() throws Exception{
//		log.info("Prueba de job");
//		System.out.println("Prueba de job");
//	}
	
//	@Scheduled(cron="0 56 10 08 * ?")
//	public void ScheduledProcessorDeleteMarcaciones() throws Exception{
//		marcacionOnlineJackcessService.deleteUNIS();
//	}
//	
//	@Scheduled(fixedDelay = 2*60000)
//	public void ScheduledProcessorInsertMarcacionesOnline() throws Exception{
//		marcacionOnlineJackcessService.insertMarcacionesOnline();
//	}
//	
//	@Scheduled(cron="0 16 12 * * ?")
//	public void ScheduledProcessorInsertMarcacionesDia1() throws Exception{
//		marcacionOnlineJackcessService.insertMarcacionesDia();		
//	}
//	
//	@Scheduled(cron="0 40 15 * * ?")
//	public void ScheduledProcessorInsertMarcacionesDia2() throws Exception{
//		System.err.println("@Scheduled(cron=0 50 14 * * ?)");
//		marcacionOnlineJackcessService.insertMarcacionesDia();		
//	}
//	
//	@Scheduled(cron="0 0 23 * * ?")
//	public void ScheduledProcessorInsertMarcacionesDia3() throws Exception{		
//		marcacionOnlineJackcessService.insertMarcacionesDia();		
//	}
//	
//	@Scheduled(cron="0 00 1 * * ?")
//	public void ScheduledProcessorUpdateAnunciosMovil() throws Exception{		
//		formularioGenericoService.UpdateEstadoAnuncios();		
//	}
//
//	@Scheduled(cron="0 30 0 * * ?")
//	public void ScheduledProcessorsDeshabilitarUsuariosPorCese() throws Exception{		
//		recursosHumanosService.deshabilitarUsuariosPorCese();
//	}
//	
//	@Scheduled(cron="0 00 05 * * ?")
//	public void ScheduledProcessorsNotificarUsuariosPorCese() throws Exception{		
//		recursosHumanosService.notificarUsuariosPorCese();
//	}
//
//	@Scheduled(cron="0 0 05 ? * MON")
//	public void ScheduledProcessorsSendResumenSolicitudesPendientesGesDoc() throws Exception{		
//		expedienteService.envioResumenExpedientesPendientesPorUnidadOrganica();
//	}
//	
//	@Scheduled(cron="0 0 06 * * ?")
//	public void ScheduledProcessorsSendResumenSolicitudesPendientesParticipacion() throws Exception{		
//		expedienteService.envioResumenExpedientesPendientesParticipacionVecinal();
//	}
//	
//	
//	
//	@Scheduled(cron="0 0 18 * * ?")
//	public void ScheduledProcessorLfwMef() throws Exception{		
//		new Util().executeLinkWsLicencia("http://localhost:8081/WebServiceProject/");
//	}
//	
//	@Scheduled(fixedDelay = 1800000)
//	public void ScheduledProcessorAudio() throws Exception{
//		tramiteService.processAudioAll();
//	}
//	
//	@Scheduled(cron="0 30 7 * * ?")
//	public void ScheduledStartServerMessage() throws Exception{
//		log.debug("ScheduledStartServerMessage()");
//		mensajeriaInstitucionalService.programerDayJob();
//	}
//
//	
//	@Scheduled(fixedDelay = 214000000)
//	public void ScheduledProcessorFacebook() throws Exception{
//		facebookService.obtenerInformacion();
//	}
//	
//	@Scheduled(fixedDelay = 216000000)	
//	public void ScheduledProcessorTwitter() throws Exception{
//		twitterService.obtenerInformacion();
//	}
//	
//	@Scheduled(cron="0 0 7 * * ?")
//	public void ScheduledCumpleano() throws Exception{	
//       sisMailService.envioMailCumple();
//
//	}
//	
//	@Scheduled(cron="0 55 6 * * ?")
//	public void ScheduledHabilitaCumple() throws Exception{	
//       sisMailService.ValordeEnvio();				
//	}
//	
//	
//	@Scheduled(cron="0 0 4 * * ?")
//	public void ScheduledSendMailReportTramite() throws Exception{
//		tramiteService.sendMailsGerentesAndSubGerentes();
//	}
//	
//	@Scheduled(cron="0 10 4 * * ?")
//	public void ScheduledSendMailReportTramiteAIP() throws Exception{
//		tramiteService.sendMailTramiteAIP();
//	}
//	@Scheduled(fixedDelay = 1800000)//cada 30 minutos
//	public void ScheduledExpedienteUpdateIndicadorColorYEnviaMail() throws Exception{
//		expedienteService.updateIndicadorColorYEnviaMail();
//	}
//
//	
//	@Scheduled(fixedDelay = 14400000)//cada 4 horas	
//	public void ScheduledActualizaSRHMPERSONAAReferenciaSigma() throws Exception{
//		log.debug("ScheduledStartActualizaPersona");
//		UtilFecha fecha=new UtilFecha();
//		personaSigService.selectActualizaSRHMPERSONAAReferenciaSigma(fecha.getFechaDateAInteger(fecha.sumaDias(new Date(),-1)), fecha.getFechaDateAInteger(new Date()));		
//	}
//	
//@Scheduled(cron="0 0 2 * * ?")
//public void ScheduledStartServerControlFisca() throws Exception{
//		log.debug("ScheduledStartServerControlFisca()");
//		actividadMovService.validarActividadesFueraPlazo();
//}
	
	/*
	@Scheduled(fixedDelay = 1800000)
	public void ScheduledProcessorMigracionSGU() throws Exception{
		log.debug("ScheduledProcessorMigracionSGU()");
		fiscalizacionService.migracionSGU();
	}

//	@Scheduled(cron="0 30 7 * * ?")
//	public void ScheduledStartServerControlFisca() throws Exception{
//		log.debug("ScheduledStartServerControlFisca()");
//		jobFiscaHorarioService.SchedulerProgramerHorario();
//	}

	@Scheduled(cron="0 30 7 * * ?")
	public void ScheduledStartServerControlFisca() throws Exception{
		log.debug("ScheduledStartServerControlFisca()");
		jobFiscaHorarioService.SchedulerProgramerHorario();
	}*/
	
	
}