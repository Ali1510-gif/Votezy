package in.scalive.votezy.dto;

import jakarta.validation.constraints.NotNull;

public class VoteRequestDTO {
	@NotNull(message = "Voter ID is required")
	private Long voterId;
	@NotNull(message = "Candidate ID is required")
	private Long candidateId;
	public Long getVoterId() {
		return voterId;
	}
	public void setVoterId(Long voterId) {
		this.voterId = voterId;
	}
	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}
}
